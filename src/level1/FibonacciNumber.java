package level1;

public class FibonacciNumber {

    public static void main(String[] args) {
        int fibNum = fib(7);
        System.out.println(fibNum);
    }

    public static int fib(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }

}
