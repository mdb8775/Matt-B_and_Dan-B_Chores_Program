/**
 * Class file for people for chores list.
 * Authors: Matt Bliss and Daniel Benedetti
 * Date: March 9 2022
**/

public class Person implements Comparable <Person>{
    private String name;
    private int pin;
    private int empty_basement_trash;
    private int sweep_and_mop_basement;
    private int pick_up_basement_trash;
    private int lounge_vacumming;
    private int empty_lounge_trash;
    private int pick_up_lounge;
    private int kitchen_trash;
    private int pick_up_kitchen;
    private int totalNum;

    //Constructor for use when numbers are given from client using CSV file
    public Person(String name, int pin, int empty_basement_trash_num, int sweep_mop_basement_num,
                int pick_up_basement_trash_num, int lounge_vacumming_num, int empty_lounge_trash_num,
                int pick_up_lounge_num, int kitchen_trash_num, int pick_up_kitchen_num, int totalNum) {

        this.name = name;
        this.pin = pin;
        this.empty_basement_trash = empty_basement_trash_num;
        this.sweep_and_mop_basement = sweep_mop_basement_num;
        this.pick_up_basement_trash = pick_up_basement_trash_num;
        this.lounge_vacumming = lounge_vacumming_num;
        this.empty_lounge_trash = empty_lounge_trash_num;
        this.pick_up_lounge = pick_up_lounge_num;
        this.kitchen_trash = kitchen_trash_num;
        this.pick_up_kitchen = pick_up_kitchen_num;
        this.totalNum = totalNum;

    }


    //The following functions are all "get" functions since fields are private
    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public int getEmpty_basement_trash() {
        return empty_basement_trash;
    }

    public int getSweep_and_mop_basement() {
        return sweep_and_mop_basement;
    }

    public int getPick_up_basement_trash() {
        return pick_up_basement_trash;
    }

    public int getLounge_vacumming() {
        return lounge_vacumming;
    }

    public int getEmpty_lounge_trash() {
        return empty_lounge_trash;
    }

    public int getPick_up_lounge() {
        return pick_up_lounge;
    }

    public int getKitchen_trash() {
        return kitchen_trash;
    }

    public int getPick_up_kitchen() {
        return pick_up_kitchen;
    }

    public int getTotalNum() {
        return totalNum;
    }

    //end of "get" functions

    @Override
    public String toString() {
        return getName();
    }


    @Override
    public int compareTo(Person o) {
        if(totalNum == o.totalNum) {
            return o.pin - pin;
        } else {
            return totalNum - o.totalNum;
        }
    }

    // main to test with
    // public static void main(String[] args){
    //     System.out.println("Hello World!");
    // }

}

