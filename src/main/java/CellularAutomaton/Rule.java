package CellularAutomaton;

public class Rule {

    String rule[];

    public Rule() {
        this.rule = new String[8];
    }

    public void populateRule(String binaryNumber) {
        try {
            for (int i = 0; i < binaryNumber.length(); i++) {
                this.rule[i] = String.valueOf(binaryNumber.charAt(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String[] getRule() {
        return rule;
    }

    public boolean printRule() {
        System.out.println(rule.length);
        for (String rule : this.rule) {
            System.out.print(rule);
            return true;
        }
        return false;
    }
}
