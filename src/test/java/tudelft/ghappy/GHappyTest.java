package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class GHappyTest {
    private GHappy gh;

    @BeforeEach
    public void before() {
        gh = new GHappy();
    }

    @ParameterizedTest(name = "{0}: ({1} = {2}")
    @CsvSource({
            "'no Gs at all','xxxx',True",
            "'One g','xxxgxx', False",
            "'two Gs and one G', 'xxggxxgx', False",
            "'one g as last char', 'xxxg', False",
            "'gs at start', 'ggxx', True",
            "'gs at end', 'xxxgg', True",
            "'one set of two gs', 'xggxxx', True",
            "'two sets of two gs', 'xggxggxx', True",
            "'three gs', 'xgggxx', True"
    })
    public void gTestAlgorithm(String testName, String testPhrase, boolean expectedResult) {
        boolean result = gh.gHappy(testPhrase);
        Assertions.assertEquals(expectedResult, result);
    }
}

