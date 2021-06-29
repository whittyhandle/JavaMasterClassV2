package CellularAutomaton;

public class Rule {

    private int[] rule;

    public Rule() {
        this.rule = new int[7];
    }

    void populateRule(String binaryNumber){
        for (int i = 0; i < binaryNumber.length(); i++) {
            System.out.println(binaryNumber.charAt(i));
        }
    }
}
