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

    //todo populate next gen
    public int[] populateNextGen(int stepCount) {

        for (int i = 0; i < stepCount; i++) {

        }

        return null;
    }

}
