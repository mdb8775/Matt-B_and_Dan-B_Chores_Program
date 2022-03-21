/**
 * List of chores, where each chore will equal a certain person\
 * Authors: Matt Bliss and Dan Benedetti
 * Date: March 9 2022
 */

public class Chores_List {
    private Person empty_basement_trash;
    private Person sweep_and_mop_basement;
    private Person pick_up_basement_trash;
    private Person lounge_vacumming;
    private Person empty_lounge_trash;
    private Person pick_up_lounge;
    private Person kitchen_trash;
    private Person pick_up_kitchen;

    public Chores_List() {
        this.empty_basement_trash = null;
        this.sweep_and_mop_basement = null;
        this.pick_up_basement_trash = null;
        this.lounge_vacumming = null;
        this.empty_lounge_trash = null;
        this.pick_up_lounge = null;
        this.kitchen_trash = null;
        this.pick_up_kitchen = null;
    }

    public Person getEmpty_basement_trash() {
        return empty_basement_trash;
    }

    public Person getSweep_and_mop_basement() {
        return sweep_and_mop_basement;
    }

    public Person getPick_up_basement_trash() {
        return pick_up_basement_trash;
    }

    public Person getLounge_vacumming() {
        return lounge_vacumming;
    }

    public Person getEmpty_lounge_trash() {
        return empty_lounge_trash;
    }

    public Person getPick_up_lounge() {
        return pick_up_lounge;
    }

    public Person getKitchen_trash() {
        return kitchen_trash;
    }

    public Person getPick_up_kitchen() {
        return pick_up_kitchen;
    }

    public void assignChore(String chore, Person p) {
        
        switch (chore) {
            case "Empty Basement Trash":
                if(this.empty_basement_trash == null) {
                    this.empty_basement_trash = p;
                }
                break;
            case "Sweep and Mop Basement":
                if(this.sweep_and_mop_basement == null) {
                    this.sweep_and_mop_basement = p;
                }
                break;
            case "Pick up Basement Trash":
                if(this.pick_up_basement_trash == null) {
                    this.pick_up_basement_trash = p;
                }
                break;
            case "Lounge Vacumming":
                if(this.lounge_vacumming == null) {
                    this.lounge_vacumming = p;
                }
                break;
            case "Empty Lounge Trash":
                if(this.empty_lounge_trash == null) {
                    this.empty_lounge_trash = p;
                }
                break;
            case "Pick up Lounge":
                if(this.pick_up_lounge == null) {
                    this.pick_up_lounge = p;
                }
                break;
            case "Kitchen Trash":
                if(this.kitchen_trash == null) {
                    this.kitchen_trash = p;
                }
                break;
            case "Pick up Kitchen":
                if(this.pick_up_kitchen == null) {
                    this.pick_up_kitchen = p;
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "Empty Basement Trash: " + empty_basement_trash +
                "\nSweep and Mop Basement: " + sweep_and_mop_basement +
                "\nPick Up Basement: " + pick_up_basement_trash +
                "\nLounge Trash: " + empty_lounge_trash +
                "\nLounge Vacuum: " + lounge_vacumming +
                "\nLounge Pickup: " + pick_up_lounge +
                "\nKitchen Trash: " + kitchen_trash +
                "\nKitchen Pickup: " + pick_up_kitchen; 
    }
}
