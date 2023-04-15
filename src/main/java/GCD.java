import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.Instant;

public class GCD {

    public static void main(String[] args) {
        Instant start = Instant.now();
        gcd(100,10);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        Instant start2 = Instant.now();
        gcd2(100,10);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();
        System.out.println(timeElapsed);
        System.out.println(timeElapsed2);

    }


    public static int gcd(int p, int q) {

        if (q == 0) return p;
        else return gcd(q, p % q);

    }


    // non-recursive implementation

    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }


}
