package CellularAutomaton;

public class Rule {

    String[] rule;

    public Rule() {
        this.rule = new String[7];
    }

    public void populateRule(String binaryNumber) {
        for (int i = 0; i < binaryNumber.length(); i++) {
            String x = String.valueOf(binaryNumber.charAt(i));
            this.rule[i] = x;
        }
    }

    public void printRule() {
        System.out.println(rule.length);
        for (String rule : this.rule) {
            System.out.print(rule);

        }
    }
}
