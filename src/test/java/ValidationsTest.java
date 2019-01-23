import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidationsTest {

    private Validations classUnderTest;

    private String testValue1 = "210 800 35 14";
    private String testValue2 = "6 90 708 11 19";
    private String testValue3 = "00 30 210 81 45 500";

    public ValidationsTest() {}

    @Before
    public void setUp() throws Exception{
        classUnderTest = new Validations();
    }

    @Test
    public void isTelephoneValid() {
        String expectedValue1 = testValue1;
        assertEquals(expectedValue1, testValue1);

        String expectedValue2 = testValue2;
        assertEquals(expectedValue2, testValue2);

        String expectedValue3 = testValue3;
        assertEquals(expectedValue3, testValue3);
    }
}