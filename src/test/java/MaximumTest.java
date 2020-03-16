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
        Integer max = findMaximum.findMaximumInteger(1, 2, 3);
        Assert.assertEquals((Integer) 3, max);
    }


}

