import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //TEST CASE 1.1
    @Test
    public void givenValue_ObjectNotNull_True() {
        Maximum maximum = new Maximum();
        maximum.findMaximumInteger();
        Assert.assertNotNull(maximum);
    }
}

