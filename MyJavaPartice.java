public class MyJavaPartice {
    /*
     * find out largest number from array largestAdjacentSum
     */
    public static int largestAdjacentSum(int[] a) {
        int maxSum = 0, tempSum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            tempSum = a[i] + a[i + 1];
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return maxSum;
    }

    /*
     * checkContenatedSum
     */
    public static int checkConcatenatedSum(int n, int catlen) {
        int originalNumber = n, sumResult = 0;
        while (n != 0) {
            int temReminder = n % 10;
            int calSume = 0;
            for (int i = 0; i < catlen; i++) {
                calSume = calSume * 10 + temReminder;
            }
            sumResult += calSume;
            n = n / 10;
        }

        return sumResult == originalNumber ? 1 : 0;
    }

    public static void main(String[] args) {
        // System.out.println(largestAdjacentSum(new int [] {1,1,1,1,1,2,1,1,1}));
        System.out.println(checkConcatenatedSum(198, 2));
    }
}
