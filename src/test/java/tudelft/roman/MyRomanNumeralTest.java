package tudelft.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRomanNumeralTest {
    private MyRomanNumeral roman ;

    @BeforeEach
    void beforeEach() {
        roman = new MyRomanNumeral();
    }

    @Test
    void convertOne() {
        assertEquals( 1, roman.convert("I")) ;
        assertEquals( 5, roman.convert("V")) ;
        assertEquals( 10, roman.convert("X")) ;
        assertEquals( 50, roman.convert("L")) ;
        assertEquals( 100, roman.convert("C")) ;
        assertEquals( 500, roman.convert("D")) ;
        assertEquals( 1000, roman.convert("M")) ;
    }

    @Test
    void convertSeveralNumbers() {
        assertEquals( 8, roman.convert("VIII"));
        assertEquals( 23, roman.convert("XXIII"));
        assertEquals( 511, roman.convert("DXI"));
        assertEquals( 3658, roman.convert("MMMDCLVIII"));
    }

    @Test
    void convertWithSubtractiveNotation() {
        assertEquals( 4, roman.convert("IV"));
        assertEquals( 49, roman.convert("IL"));
        assertEquals( 495, roman.convert("VD"));
        assertEquals( 990, roman.convert("XM"));
    }

    @Test
    void convertSeveralWithSubtractiveNotation() {
        assertEquals( 59, roman.convert("LIX"));
        assertEquals( 695, roman.convert("DCVC"));
        assertEquals( 1899, roman.convert("MDCCCIC"));
        assertEquals( 44, roman.convert("XLIV"));
    }
}