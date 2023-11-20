
import converters.ArabicToRoman;
import numbers.NumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArabicToRomanTest {

    @Test
   public void testArConvertion(){
        assertEquals("I", ArabicToRoman.arConvertion(1));
        assertEquals("IV", ArabicToRoman.arConvertion(4));
        assertEquals("IX", ArabicToRoman.arConvertion(9));
        assertEquals("XIV", ArabicToRoman.arConvertion(14));
        assertEquals("XL", ArabicToRoman.arConvertion(40));
        assertEquals("XLIX", ArabicToRoman.arConvertion(49));
        assertEquals("L", ArabicToRoman.arConvertion(50));
        assertEquals("XC", ArabicToRoman.arConvertion(90));
        assertEquals("C", ArabicToRoman.arConvertion(100));
        assertEquals("D", ArabicToRoman.arConvertion(500));
        assertEquals("CM", ArabicToRoman.arConvertion(900));
        assertEquals("M", ArabicToRoman.arConvertion(1000));
        assertThrows(NumberException.class, () -> ArabicToRoman.arConvertion(0));
        assertThrows(NumberException.class, () -> ArabicToRoman.arConvertion(-1));
        assertThrows(NumberException.class, () -> ArabicToRoman.arConvertion(4000));
    }
}
