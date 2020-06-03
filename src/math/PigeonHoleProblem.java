package math;

/**
 * Find the a number of digit 0 and 1 which is divisible by n
 */
public class PigeonHoleProblem {

    public static void main(String[] args) {
        findNumber(7);
        findNumber(5);
        findNumber(3);
    }

    private static void findNumber(int n) {

        int[] freq = new int[n];
        int reminder = 0;
        for (int i = 1; i <= n; i++) {

            reminder = (reminder * 10 + 1) % n;
            if (reminder == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    stringBuilder.append('1');

                }
                System.out.println(stringBuilder);
                return;
            }
            if (freq[reminder] != 0) { /// result comes when older number is deleted from bigger number which is the current one.
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 1; j <= i - freq[reminder]; j++) {
                    stringBuilder.append('1');
                }
                for (int j = 1; j <= freq[reminder]; j++) {
                    stringBuilder.append('0');
                }
                System.out.println(stringBuilder);
                return;
            }
            freq[reminder] = i;


        }
    }

}
