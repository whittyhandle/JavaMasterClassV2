package CodingExercise40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthyBurgerTest {

    HealthyBurger healthyBurger;

    @BeforeEach
    public void setup() {
        healthyBurger = new HealthyBurger("testMeat", 1.0);
    }

    @Test
    void itemizeHamburger() {
        healthyBurger.addHealthyAddition1("test", 2.0);
        healthyBurger.addHealthyAddition2("test", 2.0);
        assertEquals(5.0, healthyBurger.itemizeHamburger(), "values don't match");
    }
}