public class Factorial {

    public static long factorial(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return n * factorial(n-1);
    }

}
