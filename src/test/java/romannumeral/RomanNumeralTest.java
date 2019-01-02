package romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    
    @Test
    public void standardNums() {
        int result1 = new RomanNumeral("cccxxxii").convertToNum();
        Assertions.assertEquals(332,result1);

        Assertions.assertEquals(90,new RomanNumeral("xc").convertToNum());
        
        Assertions.assertEquals("mmmxcvii", new RomanNumeral(3097).convertToString());
    }
    
//    @Test
//    public void addFiveToZero() {
//        int result = new GettingStarted().addFive(0);
//        Assertions.assertEquals(5, result);
//    }

}
       // 3094      mmmxciv
       // 332       cccxxxii
       // 96        xcvi    
       // 4397      mmmmcccxcvii
       // 13        xiii
       // 1         i
       // 2         ii
       // 40        xl