import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test of Stateful
 */
public class StatefulText {

    //TODO: Test highest and lowest values of Number
    private Stateful testState;
    @Before
    public void setUp() {
        testState = new Stateful();
    }

    @Test
    public void testGenericObject() throws Exception{
        assertEquals("Text Data", "", testState.text());
        assertFalse("Boolean Data", testState.truth());
        assertEquals("Number data", -1, testState.number());
    }

    @Test
    public void testCustomObject() throws Exception {
        String testString = "Testing 1, 2, 3, 4";
        Number testNumber = 10000000;
        Boolean testBool = true;

        Stateful testState = new Stateful(testString, testNumber, testBool);
        assertEquals("Text Data", testString, testState.text());
        assertTrue("Boolean Data", testState.truth());
        assertEquals("Number data", testNumber, testState.number());
    }

    @Test
    public void testFlip() throws Exception {
        assertFalse("Before Flip", testState.truth());
        testState.flip();
        assertTrue("After Flip", testState.truth());
    }

    @Test
    public void testToString() throws Exception {
        String testString = "Testing 1, 2, 3, 4";
        Number testNumber = 10000000;
        Boolean testBool = true;
        Stateful test2Stateful = new Stateful(testString, testNumber, testBool);

        String expectedTest2StatefulStr = "Stateful[true, 10000000, \"Testing 1, 2, 3, 4\"]";
        String expectedTestStatefulStr = "Stateful[false, -1, \"\"]";

        assertTrue("Strings contain Each Other", expectedTest2StatefulStr.contains(test2Stateful
                .toString()));
        assertTrue("Strings contain Each Other", test2Stateful.toString().contains(expectedTest2StatefulStr));

        assertTrue("Strings contain Each Other", expectedTestStatefulStr.contains(testState.toString()));
        assertTrue("Strings contain Each Other", testState.toString().contains
                (expectedTestStatefulStr));
    }
}
