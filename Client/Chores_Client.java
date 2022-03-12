/**
 * This will be the client side of the program given to House Manager
 * Authors: Matt Bliss and Dan Benedetti
 * Date: March 12, 2022
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Chores_Client {

    public static ArrayList<Object> parseSheet(String filename) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> row = new ArrayList<>();

        //will need to do this after every row
            list.add(row);

        return list;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Would you like to use data from a previous Google Sheets file? (y/n) ");

        ArrayList<Object> list;

        String answer = inputScanner.next();
        System.out.println();
        if(answer == "y") {
            System.out.print("Path of the CSV file: ");
            answer = inputScanner.next();

            //TODO need to either loop and send each list seperately, or need to send list of lists
            list = parseSheet(answer);
        }

        //TODO send list to server
        
        //TODO wait for server to send chore list back

        //TODO Format and print list


        inputScanner.close();
    }
}