package at.fhj.msd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add1() {
        assertEquals(20, calc.add(15.0, 5.));
    }
    @Test
    void add2() {

        double result = 3.0 + 3.3;
        assertEquals( result , calc.add(3.0, 3.3));

    }

    @Test
    void minus1() {
        assertEquals(10, calc.minus(15.0, 5.));
    }

    @Test
    void minus2() {
        assertTrue(calc.minus(5., 5.) == 0);
    }


    @Test
    void multiply1() {
        assertEquals(1, calc.multiply(10.0, 0.1));
    }

    @Test
    void multiply2() {
        assertNotEquals(1.1, calc.multiply(10.0, 0.1));
    }

    @Test
    void divide1() {
            assertEquals(5.0, calc.divide(10.0, 2.0));
    }

    @Test
    void divide2() {

           assertEquals(100, calc.divide(10.0, 0.1));
    }

    @Test
    void calcFaculty1() {
        double result = 1*2*3*4;
        assertEquals(result, calc.calcFaculty(4));
    }

    @Test
    void calcFaculty2() {

        assertEquals(120, calc.calcFaculty(5));
    }

    @Test
    void calcFaculty3() {

        assertEquals(1, calc.calcFaculty(1));
    }
}