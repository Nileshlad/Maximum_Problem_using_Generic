import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //OBJECT
    Maximum findMaximum = new Maximum();

    //TEST CASE 1.1
    @Test
    public void givenValue_NotNull_True() {
        findMaximum.findMaximumInteger(1,2,3);
        Assert.assertNotNull(findMaximum);
    }

    //TEST CASE 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Integer maximumInteger = findMaximum.findMaximumInteger(1, 2, 3);
        Assert.assertEquals((Integer) 3, maximumInteger);
    }

    //TEST CASE 1.3
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Integer maximumInteger = findMaximum.findMaximumInteger(3, 2, 1);
        Assert.assertEquals((Integer) 3, maximumInteger);
    }

    //TEST CASE 1.4
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        Integer maximumInteger = findMaximum.findMaximumInteger(3, 1, 2);
        Assert.assertEquals((Integer) 3, maximumInteger);
    }

    //TEST CASE 2.1
    @Test
    public void givenThreeValue_NotNull_True() {
        findMaximum.findMaximumFloat(1.2f,2.2f,3.3f);
        Assert.assertNotNull(findMaximum);
    }
}

