/**
 * The chores program is all one file, where it asks for a CSV file and makes 
 * people using the Person class, and then makes a list of these people that will
 * then be assigned chores.
 * 
 * Authors: Matt Bliss and Dan Benedetti
 * Date: March 12, 2022
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Chores_Main {

    /**
     * This function parses the CSV file and makes a list of all the people in the spreadsheet
     * @param filename - name of CSV file
     * @return - list of brothers
     */
    private static ArrayList<Person> parseSheet(String filename) {
        ArrayList<Person> list = new ArrayList<>();

        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String fields = reader.readLine();
            String line = fields; //set lines equal to fields first for while loop before reading next line
            
            //the following variables are all for storing values of fields in the spreadsheet
            String[] tokens;
            Person p;
            String name; 
            int pin;
            int empty_basement_trash_num;
            int sweep_mop_basement_num;
            int pick_up_basement_trash_num;
            int lounge_vacumming_num;
            int empty_lounge_trash_num;
            int pick_up_lounge_num;
            int kitchen_trash_num;
            int pick_up_kitchen_num;
            int totalNum;


            while((line = reader.readLine()) != null) {  //reads next line and checks if it's null
                tokens = line.split(",");

                name = tokens[0];
                pin = Integer.parseInt(tokens[1]);
                empty_basement_trash_num = Integer.parseInt(tokens[2]);
                sweep_mop_basement_num = Integer.parseInt(tokens[3]);
                pick_up_basement_trash_num = Integer.parseInt(tokens[4]);
                lounge_vacumming_num = Integer.parseInt(tokens[5]);
                empty_lounge_trash_num = Integer.parseInt(tokens[6]);
                pick_up_lounge_num = Integer.parseInt(tokens[7]);
                kitchen_trash_num = Integer.parseInt(tokens[8]);
                pick_up_kitchen_num = Integer.parseInt(tokens[9]);
                totalNum = Integer.parseInt(tokens[10]);

                p = new Person(name, pin, empty_basement_trash_num, sweep_mop_basement_num, pick_up_basement_trash_num, lounge_vacumming_num, empty_lounge_trash_num, pick_up_lounge_num, kitchen_trash_num, pick_up_kitchen_num, totalNum);
            
                list.add(p);
            }
            fr.close();
            reader.close();

        } catch(IOException e) {
            System.err.println(filename + " could not be found.");
        }
        return list;
    }

    /**
     * This function takes the list of all brothers in the CSV file and shrinks
     * the list down so that the list only contains those that can be chosen for chores this week.
     * @param people - list of all brothers that will be resized to only those that 
     *                 will be doing chores this week
     */
    private static void chooseBrothers(ArrayList<Person> people, int numOfChores) { 
        Collections.sort(people);

        while(people.size() > numOfChores) {
            people.remove(people.size() - 1);
        }

        System.out.println(people);
        System.out.println();
    }

    /**
     * This function is simply a helper function to automate calling get functions
     * while iterating through the list of chores
     * @param i - index of previous function used for switch case
     * @param p - person to call get function on
     * @return - return the number returned from the get function
     */
    public static int callGetter(int i, Person p) {
        int num = 0;

        if(i == 0) {
            num = p.getEmpty_basement_trash();
        }else if(i == 1) {
            num = p.getSweep_and_mop_basement();
        }else if (i == 2) {
            num = p.getPick_up_basement_trash();
        }else if (i == 3) {
            num = p.getPick_up_lounge();
        }else if (i == 4) {
            num = p.getLounge_vacumming();
        }else if (i == 5) {
            num = p.getPick_up_lounge();
        }else if (i == 6) {
            num = p.getKitchen_trash();
        }else if (i == 7) {
            num = p.getPick_up_kitchen();
        }
        return num;
    }

    /**
     * This function takes a list of selected brothers and assigns them a chore,
     * returning the list of chores to be printed later to terminal.
     * @param people - list of brothers chosen for chores this week
     * @return - list of chores and the brothers assigned to them
     */
    private static void makeChoreList(ArrayList<Person> people, Chores_List c_list) {
        String[] chores = {"Empty Basement Trash","Sweep and Mop Basement","Pick Up Basement",
                            "Lounge Trash","Lounge Vacuum","Lounge Pickup","Kitchen Trash",
                            "Kitchen Pickup"};

        int min = 0;
        Person possible;
        
        for(int i = 0; i < chores.length; i++) {    //loop to iterate over each chore
            possible = people.get(0);
            min = callGetter(i, possible);
            
            for(int j = 1; j < people.size(); j++) {    //loop to iterate over people            
                Person comparePerson = people.get(j);
                int compareNum = callGetter(i, comparePerson);

                boolean needToSwap = false;

                if(compareNum < min) {
                    needToSwap = true;
                }else if(compareNum == min) {
                    int pinNum = possible.compareTo(comparePerson);
                    if(pinNum > 0) {
                        needToSwap = true;
                    }
                }

                if(needToSwap == true) {
                    min = compareNum;
                    possible = comparePerson;
                }
                
            }
            //assign person to chore
            c_list.assignChore(i, possible);
            //remove person from list so they are not chosen again
            people.remove(possible);
        }
    }

    /**
     * Mian function that asks user for the FULL path 
     * @param args
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        ArrayList<Person> people_list;
        int numOfChores = 8;    //this number can be changed if more chores are added to weekly list
        Chores_List c_list = new Chores_List();

        System.out.print("Path of the CSV file: ");
        String filename = inputScanner.nextLine().strip();
        System.out.println();

        if(filename.charAt(0) == ('\"')){
            String[] words = filename.split("\"");
            people_list = parseSheet(words[1]);
            
        } else {
            people_list = parseSheet(filename);
        }
        

        chooseBrothers(people_list, numOfChores);
        
        makeChoreList(people_list, c_list);

        System.out.println(c_list);

        inputScanner.close();
    }
}