package CellularAutomaton;

public class Rule {

    int[] rule;

    public Rule() {
        this.rule = new int[7];
    }

    void populateRule(String binaryNumber) {
        for (int i = 0; i < binaryNumber.length(); i++) {
            char x = binaryNumber.charAt(i);
            rule[i] = x;
        }
    }
}
