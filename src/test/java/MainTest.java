import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testSquare() {
        assertEquals(4.0, Main.square(-2.0));
    }

    @Test
    void testAddition() {
        assertEquals(5, Main.addition(2, 3));
    }

    @Test
    void testGreaterHundred() {
        assertTrue(Main.greaterHundred(101));
    }

    @Test
    void testLowerHundred() {
        assertFalse(Main.greaterHundred(Double.MIN_VALUE));
    }



    @Test
    void tooManyPersonsRed() {
        assertEquals("Zu viele Personen", Main.checkPersonCount(12, "rot"));
    }

    @Test
    void lessPersonsRed() {
        assertEquals("Maximale Personenzahl nicht überschritten", Main.checkPersonCount(-3, "rot"));
    }
    @Test
    void tooManyPersonsYellow() {
        assertEquals("Zu viele Personen", Main.checkPersonCount(35, "gelb"));
    }

    @Test
    void lessPersonsYellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Main.checkPersonCount(20, "gelb"));
    }
    @Test
    void tooManyPersonsGreen() {
        assertEquals("Zu viele Personen", Main.checkPersonCount(65, "grün"));
    }

    @Test
    void lessPersonsGreen() {
        assertEquals("Maximale Personenzahl nicht überschritten", Main.checkPersonCount(20, "grün"));
    }



}