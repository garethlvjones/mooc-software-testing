package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumFinderTest {
    
    
    @Test
    public void test_goodNumbers() {
        NumFinder nf = new NumFinder();
        nf.find(new int[] {4, 3, 2, 1});
        Assertions.assertEquals(nf.getLargest(), 4, "4 is biggest");
        Assertions.assertEquals(nf.getSmallest(), 1, "1 is smallest");
    }
    
    @Test
    public void test_badNUmbers() {
        NumFinder nf = new NumFinder();
        nf.find(null);
        Assertions.assertEquals(nf.getLargest(), 0, "null gets 0");
        Assertions.assertEquals(nf.getSmallest(), 0, "null gets 0");
    }

}
