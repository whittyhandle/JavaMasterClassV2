package CodingExercise40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HamburgerTest {

    @Test
    void itemizehamburger() {

        Hamburger hamburger = new Hamburger("test", "test", 1.0, "test");
        hamburger.addHamburgerAddition1("test", 1.0);
        hamburger.addHamburgerAddition2("test", 1.0);
        hamburger.addHamburgerAddition3("test", 1.0);
        hamburger.addHamburgerAddition4("test", 1.0);

        double expectedValue = 5.0;
        double actualValue = hamburger.itemizehamburger();
        assertEquals(expectedValue, actualValue, "values are not the same");
    }
}