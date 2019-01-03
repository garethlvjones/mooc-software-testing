package romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    
    @Test
    void singleNumber() {
        RomanNumeral roman = new RomanNumeral("I");
        Assertions.assertEquals(1,roman.convertToNum());
    }
    
    @Test
    void numberWithmanyDigits() {
        RomanNumeral roman = new RomanNumeral("VIII");
        Assertions.assertEquals(8,roman.convertToNum());
    }
    
    @Test
    void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral("iv");
        Assertions.assertEquals(4,roman.convertToNum());
        
    }
            
    
    @Test
    public void standardNums() {
        int result1 = new RomanNumeral("cccxxxii").convertToNum();
        Assertions.assertEquals(332,result1);

        Assertions.assertEquals(90,new RomanNumeral("xc").convertToNum());
        
        Assertions.assertEquals("mmmxcvii", new RomanNumeral(3097).convertToString());
    }
    
    @Test
    public void simpleTests() {
        Assertions.assertEquals(1,new RomanNumeral("i").convertToNum());
        Assertions.assertEquals(5,new RomanNumeral("v").convertToNum());
    }

}
       // 3094      mmmxciv
       // 332       cccxxxii
       // 96        xcvi    
       // 4397      mmmmcccxcvii
       // 13        xiii
       // 1         i
       // 2         ii
       // 40        xl