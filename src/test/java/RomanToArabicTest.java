import converters.RomanToArabic;
import numbers.RomanException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanToArabicTest {

    @Test
    public void testRaConvertion() {
        assertEquals(1, RomanToArabic.raConvertion("I"));
        assertEquals(4, RomanToArabic.raConvertion("IV"));
        assertEquals(9, RomanToArabic.raConvertion("IX"));
        assertEquals(14, RomanToArabic.raConvertion("XIV"));
        assertEquals(40, RomanToArabic.raConvertion("XL"));
        assertEquals(49, RomanToArabic.raConvertion("XLIX"));
        assertEquals(50, RomanToArabic.raConvertion("L"));
        assertEquals(90, RomanToArabic.raConvertion("XC"));
        assertEquals(100, RomanToArabic.raConvertion("C"));
        assertEquals(500, RomanToArabic.raConvertion("D"));
        assertEquals(900, RomanToArabic.raConvertion("CM"));
        assertEquals(1000, RomanToArabic.raConvertion("M"));
        assertThrows(RomanException.class, () -> RomanToArabic.raConvertion("daskjdsakjdsa"));
        assertThrows(RomanException.class, () -> RomanToArabic.raConvertion(""));
        //passou
    }
}
