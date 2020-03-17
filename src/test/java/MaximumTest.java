import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //To Test Cases For Integer Values
    //TEST CASE 1.1
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum(3, 2, 1);
        Integer max = (Integer) findMaximum.testMaximum();
        Assert.assertEquals((Integer) 3, max);
    }

    //TEST CASE 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum(2, 3, 1);
        Integer max = (Integer) findMaximum.testMaximum();
        Assert.assertEquals((Integer) 3, max);
    }

    //TEST CASE 1.3
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum(1, 2, 3);
        Integer max = (Integer) findMaximum.testMaximum();
        Assert.assertEquals((Integer) 3, max);
    }

    //To Test Cases For float Values
    //TEST CASE 2.1
    @Test
    public void givenThreeFloat_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum(3.3f, 2.2f, 1.1f);
        Float maximumFloat = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 3.3f, maximumFloat);
    }

    //TEST CASE 2.2
    @Test
    public void givenThreeFloat_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum(2.2f, 3.3f, 1.1f);
        Float maximumFloat = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 3.3f, maximumFloat);
    }

    //TEST CASE 2.3
    @Test
    public void givenThreeFloat_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum(2.2f, 3.3f, 1.1f);
        Float maximumFloat = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 3.3f, maximumFloat);
    }

    //To Test Cases For String Values
    //TEST CASE 3.1
    @Test
    public void givenThreeString_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum("3", "2", "1");
        String maximum = (String) findMaximum.testMaximum();
        Assert.assertEquals("3", maximum);
    }

    //TEST CASE 3.2
    @Test
    public void givenThreeString_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum("1", "2", "3");
        String maximum = (String) findMaximum.testMaximum();
        Assert.assertEquals("3", maximum);
    }

    //TEST CASE 3.3
    @Test
    public void givenThreeString_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        Maximum findMaximum = new Maximum("3", "1", "2");
        String maximum = (String) findMaximum.testMaximum();
        Assert.assertEquals("3", maximum);
    }
}

