import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void zeroTest(){
        int p = 100;
        int q = 0;
    int expected = 100;
    int actual = GCD.gcd(p,q);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCDTest(){
        int p = 102;
        int q = 68;
        int expected = 34;
        int actual = GCD.gcd(p,q);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void GCD2Test(){
        int p = 102;
        int q = 68;
        int expected = 34;
        int actual = GCD.gcd2(p,q);

        Assert.assertEquals(expected,actual);
    }
}
