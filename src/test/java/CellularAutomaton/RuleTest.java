package CellularAutomaton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleTest {

    @Test
    void populateRule() {
        Rule rule = new Rule();
        rule.populateRule("11110000");
        rule.printRule();
    }
}