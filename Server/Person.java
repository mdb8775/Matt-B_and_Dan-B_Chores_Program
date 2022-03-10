/**
Class file for people for chores list.
Authors: Matt B and Dan B
Date: March 9 2022
**/

public class Person {
    private String name;
    private int empty_basement_trash;
    private int sweep_and_mop_basement;
    private int pick_up_basement_trash;
    private int lounge_vacumming;
    private int empty_lounge_trash;
    private int pick_up_lounge;
    private int kitchen_trash;
    private int pick_up_kitchen;

    public Person(String name) {
        this.name = name;
        this.empty_basement_trash = 0;
        this.sweep_and_mop_basement = 0;
        this.pick_up_basement_trash = 0;
        this.lounge_vacumming = 0;
        this.empty_lounge_trash = 0;
        this.pick_up_lounge = 0;
        this.kitchen_trash = 0;
        this.pick_up_kitchen = 0;
    }

    /**
     * TODO should definitely put in a constructor here to set all the variables
     * for when we need to set the numbers first when using data from CSV file
    **/

    public String getName() {
        return name;
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

    public void incrementEmpty_basement_trash() {
        this.empty_basement_trash += 1;
    }

    public void incrementSweep_and_mop_basement() {
        this.sweep_and_mop_basement += 1;
    }

    public void incrementPick_up_basement_trash() {
        this.pick_up_basement_trash += 1;
    }

    public void incrementLounge_vacumming() {
        this.lounge_vacumming += 1;
    }

    public void incrementEmpty_lounge_trash() {
        this.empty_lounge_trash += 1;
    }

    public void incrementPick_up_lounge() {
        this.pick_up_lounge += 1;
    }

    public void incrementKitchen_trash() {
        this.kitchen_trash += 1;
    }

    public void incrementPick_up_kitchen() {
        this.pick_up_kitchen += 1;
    }

public static void main(){
    System.out.println("Hello World!");
}

}

