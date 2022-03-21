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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Chores_Main {

    private static ArrayList<Person> parseSheet(String filename) {
        ArrayList<Person> list = new ArrayList<>();

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader reader = new BufferedReader(fr);

            String fields = reader.readLine();
            String line = fields; //set lines equal to fields first for while loop before reading next line
            
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


            while(line != null) {
                line = reader.readLine();
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
     * the list down so that the list only contains those chosen for chores this week.
     * This list will then be used in the next function, where all brothers in this list
     * will then be assigned a chore.
     * 
     * @param people - list of all brothers that will be resized to only those that 
     *                 will be doing chores this week
     */
    private static void chooseBrothers(ArrayList<Person> people) {
        //TODO

    }

    /**
     * This function takes a list of selected brothers and assigns them a chore,
     * returning the list of chores to be printed later to terminal.
     * 
     * @param people - list of brothers chosen for chores this week
     * @return - list of chores and the brothers assigned to them
     */
    private static Chores_List makeChoreList(ArrayList<Person> people) {
        Chores_List c_list = new Chores_List();
        //TODO


        return c_list;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        ArrayList<Person> people_list;
        Chores_List c_list;

        System.out.print("Path of the CSV file: ");
        String filename = inputScanner.next();

        people_list = parseSheet(filename);

        chooseBrothers(people_list);
        
        c_list = makeChoreList(people_list);


        //TODO Format and print list


        inputScanner.close();
    }
}