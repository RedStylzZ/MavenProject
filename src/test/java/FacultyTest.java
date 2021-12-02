import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FacultyTest {

    @Test
    void faculty0() {
        assertEquals(1, Main.calcFacultyFor(0));
    }

    @Test
    void faculty1() {
        assertEquals(1, Main.calcFacultyFor(1));
    }

    @Test
    void faculty2() {
        assertEquals(2, Main.calcFacultyFor(2));
    }

    @Test
    void faculty3() {
        assertEquals(6, Main.calcFacultyFor(3));
    }

    @Test
    void faculty4() {
        assertEquals(24, Main.calcFacultyFor(4));
    }
}
