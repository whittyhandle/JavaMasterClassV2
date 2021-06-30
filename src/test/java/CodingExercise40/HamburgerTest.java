package CodingExercise40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HamburgerTest {
    Hamburger hamburger;

    @BeforeEach
    public void setup() {
        hamburger = new Hamburger("testName", "testMeat", 1.0, "testRoll");
    }

    @Test
    void itemizeHamburger() {
        hamburger.addHamburgerAddition1("testOption1", 0.1);
        hamburger.addHamburgerAddition2("testOption2", 0.2);
        hamburger.addHamburgerAddition3("testOption3", 0.3);
        hamburger.addHamburgerAddition4("testOption4", 0.4);

        assertEquals(2.0, hamburger.itemizeHamburger());
    }
}