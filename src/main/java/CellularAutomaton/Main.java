package CellularAutomaton;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Rule rule = new Rule(); // create new rule
        rule.populateRule("00011110"); // set up the rule

        Cellular cellular = new Cellular(rule, 8); // create the cell object;
        cellular.populateCurrentGen(); // populate the current cell object
        cellular.populateNextGen(8);
        cellular.printNextGen();
    }
}
