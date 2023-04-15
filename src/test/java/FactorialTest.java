import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void isN1Test() {
        int n = 1;
        long expected = 1;
        long acutal = Factorial.factorial(n);

        Assert.assertEquals(expected,acutal);

    }

    @Test
    public void NisMoreThan1Test(){
        int n = 3;
        long expected = 6;
        long actual = Factorial.factorial(n);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isZeroTest(){
        int n = 0;
        long expected = 0;
        long actual = Factorial.factorial(n);

        Assert.assertEquals(expected, actual);
    }

}
