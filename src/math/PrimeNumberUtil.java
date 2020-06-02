package math;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberUtil {


    List<Integer> getPrimeFactors(int n) {

        List<Integer> result = new ArrayList<>();

        int candidatePrime = 2;
        while (n > 1 && candidatePrime * candidatePrime <= n) {

            int factorCount = 0;
            while (n % candidatePrime == 0) {
                n /= candidatePrime; //divide by candidate prime until modulous becomes zero
                factorCount++;
            }
            while (factorCount != 0) {
                result.add(candidatePrime);
                factorCount--;
            }
            candidatePrime++;
        }
        if (n > 1) { // if(n >1) it is itself prime
            result.add(n);
        }

        return result;
    }

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
//        System.out.println(primeNumberUtil.isPrime(1000));
//        System.out.println(primeNumberUtil.isPrime(2));
//        System.out.println(primeNumberUtil.isPrime(3));
//        System.out.println(primeNumberUtil.isPrime(4));
//        System.out.println(primeNumberUtil.isPrime(5));
        
        System.out.println(primeNumberUtil.getPrimeFactors(1000));
        System.out.println(primeNumberUtil.getPrimeFactors(2));
        System.out.println(primeNumberUtil.getPrimeFactors(3));
        System.out.println(primeNumberUtil.getPrimeFactors(4));
        System.out.println(primeNumberUtil.getPrimeFactors(5));
        System.out.println(primeNumberUtil.getPrimeFactors(46));
    }
}
