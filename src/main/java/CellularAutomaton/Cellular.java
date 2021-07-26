package CellularAutomaton;

import java.util.Arrays;
import java.util.StringJoiner;

public class Cellular {

    private Rule rule;
    private int stepCount;
    private int[] currentGeneration;
    private int[] nextGeneration;

    public Cellular(Rule rule, int stepCount) {
        this.rule = rule;
        this.stepCount = stepCount;
        this.currentGeneration = new int[8];
        this.nextGeneration = new int[8];
    }

    public Rule getRule() {
        return rule;
    }

    public int[] populateCurrentGen() {
        for (int i = 0; i < rule.getRule().length; i++) {
            this.currentGeneration[i] = Integer.parseInt(rule.getRule()[i]);
        }
        return currentGeneration;
    }

    public int[] populateNextGen(int stepCount) {
        for (int i = 1; i < currentGeneration.length - 1; i++) {
            int nMinusOne = currentGeneration[i -1];
            int n = currentGeneration[i];
            int nPlusOne = currentGeneration[i +1];
            System.out.println(nMinusOne + " " + n + " " + nPlusOne);
            if (nMinusOne == 0 && n == 0 && nPlusOne == 0) nextGeneration[i] = 1; //000

            if (nMinusOne == 0 && n == 0 && nPlusOne == 1) nextGeneration[i] = 1; //001

            if (nMinusOne == 0 && n == 1 && nPlusOne == 0) nextGeneration[i] = 1; //010

            if (nMinusOne == 0 && n == 1 && nPlusOne == 1) nextGeneration[i] = 1; //011

            if (nMinusOne == 1 && n == 0 && nPlusOne == 0) nextGeneration[i] = 1; //100

            if (nMinusOne == 1 && n == 0 && nPlusOne == 1) nextGeneration[i] = 0; //101

            if (nMinusOne == 1 && n == 1 && nPlusOne == 0) nextGeneration[i] = 0; //110

            if (nMinusOne == 1 && n == 1 && nPlusOne == 1) nextGeneration[i] = 0; //111

        }
        return nextGeneration;
    }

    public void printNextGen() {
        for (int i : nextGeneration) {
            System.out.print(i);
        }
    }

}
