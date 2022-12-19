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

    /*
     * isSequencedArray
     */
    public static int isSequencedArray(int[] a, int m, int n) {
        if (a.length <= 1 || a[0] != m || a[a.length - 1] != n || m > n)
            return 0;

        for (int i = m; i <= n; i++) {
            boolean flag = false;

            for (int j = 1; j <= a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    return 0;
                }

                if (a[j - 1] == i || a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        return 1;
    }

    public static int[] arrayCommon(int[] first, int[] seceond) {
        if (first == null || seceond == null) {
            return null;
        }
        if (first.length == 0 || seceond.length == 0) {
            return new int[0];
        }
        int mini = (first.length < seceond.length) ? first.length : seceond.length;
        int[] a, b;
        if (first.length == mini) {
            a = first;
            b = seceond;
        } else {
            a = seceond;
            b = first;
        }

        int[] c = new int[mini];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[i] = a[i];
                    k++;
                }
            }
        }
        int[] arrayReturn = new int[k];
        for (int t = 0; t < arrayReturn.length; t++) {
            arrayReturn[t] = c[t];
        }

        return arrayReturn;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println(largestAdjacentSum(new int [] {1,1,1,1,1,2,1,1,1}));
        // System.out.println(checkConcatenatedSum(198, 2));
        // System.out.println(isSequencedArray(new int [] {1, 2, 3, 4, 5}));
        System.out.println(arrayCommon(new int[] { 1, 8, 3, 2 }, new int[] { 4, 2, 6, 1 }));
    }
}
