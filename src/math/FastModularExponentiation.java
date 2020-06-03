package math;

public class FastModularExponentiation {

    public static void main(String[] args) {

        System.out.println(fastExpo(7, 3, 10));
        System.out.println(fastExpoIterative(7, 3, 10));

    }

    /**
     * @param a
     * @param n
     * @param mod
     * @return a ^ n % mod
     */
    private static Integer fastExpo(int a, int n, int mod) {

        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return fastExpo((int) ((1D * a * a) % mod), n / 2, mod);

        }
        return (int) (1D * a * fastExpo(a, n - 1, mod)) % mod;
    }

    private static Integer fastExpoIterative(int a, int n, int mod) {

        int ans = 1;
        // a =2 , n = 13--> 2^13, ans =1 ;
        // 1; n is odd; 2* (2^12), ans =1; ---- (2^12), ans=2;
        // 2) n is even: (2^2)^6, a =4, n = 6, ans =2;
        //2) n iseevn :

        while (n >= 1) {
            if (n % 2 == 0) {
                a = (int) ((1D * a * a) % mod);
                n /= 2;
            } else {
                ans = (int) ((1D * ans * a) % mod);
                n--;
            }
        }
        return ans;
    }

}
