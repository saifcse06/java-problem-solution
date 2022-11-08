public class PractiseQuestions {
    public static void main(String[] args) {
        // System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1
        // }));
        // System.out.println(checkConcatenatedSum(198, 2));

        // System.out.println(isSequencedArray(new int[] { -5, -5, -4, -4, -4, -3, -3,
        // -2, -2, -2 }, -5, -2));
        System.out.println(largestPrimeFactor(10));
        // System.out.println(isSequencedArray(new int[] { 1, 2, 3, 4 }, 1, 5));
        // System.out.println(isSequencedArray(new int[] { 1, 2, 5 }, 1, 5));
        // System.out.println(isSequencedArray(new int[] { 5, 4, 3, 2, 1 }, 1, 5));

    }

    static int largestAdjacentSum(int[] a) {
        int result = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > result) {
                result = a[i] + a[i + 1];
            }
        }
        return result;
    }

    static int checkConcatenatedSum(int n, int catlen) {
        int tempN = n, sumResult = 0;

        while (tempN > 0) {
            int remain = tempN % 10;
            int catlenSum = 0;
            for (int i = 0; i < catlen; i++) {
                catlenSum = catlenSum * 10 + remain;
            }
            sumResult += catlenSum;
            tempN /= 10;
        }

        return n == sumResult ? 1 : 0;
    }

    static int isSequencedArray(int[] a, int m, int n) {
        if (a.length <= 1 || a[0] != m || a[a.length - 1] != n || m > n)
            return 0;

        for (var i = m; i < n; i++) {
            boolean flag = false;

            for (int j = 1; j < a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    return 0;
                }
                if (a[j - 1] == i || a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }

        }

        return 1;
    }

    static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0;
        }
        int largestPrimeFactor = 2;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                largestPrimeFactor = i;
            }

        }

        return largestPrimeFactor;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }

}
