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

public class Chores_Main {

    private static ArrayList<Person> parseSheet(String filename) {
        ArrayList<Person> list = new ArrayList<>();

        //TODO will need to do this after every row
            //list.add(new Person);

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