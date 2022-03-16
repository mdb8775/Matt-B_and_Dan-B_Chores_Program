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

public class Chores_Client {

    public static ArrayList<Object> parseSheet(String filename) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> row = new ArrayList<>();

        //TODO will need to do this after every row
            list.add(row);

        return list;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        ArrayList<Object> people_list;

        System.out.print("Path of the CSV file: ");
        String filename = inputScanner.next();

        people_list = parseSheet(filename);

        //TODO Format and print list


        inputScanner.close();
    }
}