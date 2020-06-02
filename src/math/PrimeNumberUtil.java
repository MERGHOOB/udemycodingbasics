package math;

public class PrimeNumberUtil {

    boolean isPrime(int n) {
        //Base case
        if (n <= 1) {
            return false;
        }
        //Base case
        if (n == 2) {
            return true;
        }

        double sqrt = Math.sqrt(n);

        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumberUtil primeNumberUtil = new PrimeNumberUtil();
        System.out.println(primeNumberUtil.isPrime(1000));
        System.out.println(primeNumberUtil.isPrime(2));
        System.out.println(primeNumberUtil.isPrime(3));
        System.out.println(primeNumberUtil.isPrime(4));
        System.out.println(primeNumberUtil.isPrime(5));
    }
}
