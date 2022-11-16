public class PractiseQuestions {
    public static void main(String[] args) {
        // System.out.println(largestAdjacentSum(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1
        // }));
        // System.out.println(checkConcatenatedSum(198, 2));

        // System.out.println(isSequencedArray(new int[] { -5, -5, -4, -4, -4, -3, -3,
        // -2, -2, -2 }, -5, -2));
        // System.out.println(largestPrimeFactor(10));
        // System.out.println(isSequencedArray(new int[] { 1, 2, 3, 4 }, 1, 5));
        // System.out.println(isSequencedArray(new int[] { 1, 2, 5 }, 1, 5));
        // System.out.println(isSequencedArray(new int[] { 5, 4, 3, 2, 1 }, 1, 5));

        // System.out.println(Arrays.toString(encodeNumber(6936)));
        // System.out.println(Arrays.toString(encodeNumber(2)));
        // System.out.println(Arrays.toString(encodeNumber(6)));
        // System.out.println(Arrays.toString(encodeNumber(14)));
        // System.out.println(Arrays.toString(encodeNumber(24)));
        // System.out.println(Arrays.toString(encodeNumber(1200)));
        // System.out.println(Arrays.toString(encodeNumber(1)));
        // System.out.println(Arrays.toString(encodeNumber(-18)));
        // int[] a = new int[] { 1, 2, 3, 4, 5 };
        // doIntegerBasedRounding(a, 3);
        // System.out.println(Arrays.toString(a));

        // System.out.println(isCubePowerful(-81));

        // System.out.println(decodeArray(new int[] { -1, 5, 8, 17, 15 }));

        // System.out.println(isDigitIncreasing(36));

        // System.out.println(isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
        // System.out.println(isOnionArray(new int[] { 1, 2, 3, 4, 15 }));
        // System.out.println(isOnionArray(new int[] { 1, 3, 9, 8 }));
        // System.out.println(isOnionArray(new int[] { 2 }));
        // System.out.println(isOnionArray(new int[] {}));
        // System.out.println(isOnionArray(new int[] { -2, 5, 0, 5, 12 }));

        // System.out.println(isPrimeHappy(5));
        // System.out.println(isPrimeHappy(25));
        // System.out.println(isPrimeHappy(32));
        // System.out.println(isPrimeHappy(8));
        // System.out.println(isPrimeHappy(2));

        // System.out.println(isSystematicallyIncreasing(new int[] { 1, 1, 2, 3 }));

        // System.out.println(isFactorialPrime(2));
        // System.out.println(isFactorialPrime(3));
        // System.out.println(isFactorialPrime(7));
        // System.out.println(isFactorialPrime(8));
        // System.out.println(isFactorialPrime(11));
        // System.out.println(isFactorialPrime(721));

        // System.out.println(largestDifferenceOfEvens(new int[] { -2, 3, 4, 9 }));
        // System.out.println(largestDifferenceOfEvens(new int[] { 1, 3, 5, 9 }));
        // System.out.println(largestDifferenceOfEvens(new int[] { 1, 18, 5, 7, 33 }));
        // System.out.println(largestDifferenceOfEvens(new int[] { 2, 2, 2, 2 }));
        // System.out.println(largestDifferenceOfEvens(new int[] { 1, 2, 1, 2, 1, 4, 1,
        // 6, 4 }));

        // System.out.println(isHolderNumber(3));
        // System.out.println(isHolderNumber(7));
        // System.out.println(isHolderNumber(31));
        // System.out.println(isHolderNumber(127));

    }

    static int isHolderNumber(int n) {
        if (isPrime(n)) {
            int number = 0, product = 1;

            while (number < n) {
                product *= 2;
                number = product - 1;
            }

            if (n == number) {
                return 1;
            }
            return 0;
        }

        return 0;
    }

    static int largestDifferenceOfEvens(int[] a) {
        boolean evenFlag = false;
        int largestDiff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        evenFlag = true;
                        int diff = a[i] > a[j] ? a[i] - a[j] : a[j] - a[i];
                        largestDiff = diff > largestDiff ? diff : largestDiff;
                    }
                }
            }
            if (!evenFlag && i == a.length - 1)
                return -1;
        }

        return largestDiff;
    }

    static int isFactorialPrime(int n) {
        if (isPrime(n)) {
            int sum = 0;
            for (int index = 0; index < n && sum < n; index++) {
                sum = factorial(index) + 1;
            }
            if (sum == n) {
                return 1;
            } else {
                return 0;
            }
        }

        return 0;
    }

    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int isSystematicallyIncreasing(int[] a) {
        int j = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != j) {
                return 0;
            }
            j++;

        }

        return 1;
    }

    static int isPrimeHappy(int n) {
        int number = 2;
        boolean primeFlag = false;
        int sum = 0;
        while (number < n) {
            if (isPrime(number)) {
                primeFlag = true;
                sum += number;
            }
            number++;
        }
        if (primeFlag && sum % n == 0)
            return 1;
        else
            return 0;
    }

    static int isPrimeHappy2(int n) {
        int sumPrime = 0;
        if (n <= 2) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sumPrime += i;
            }
        }
        if (sumPrime % n != 0) {
            return 0;
        }

        return 1;
    }

    static int isOnionArray(int[] a) {
        if (a.length < 2) {
            return 1;
        }
        int i = 0;
        int j = a.length - 1;
        while (j > i) {
            if (a[i] + a[j] > 10 && j + i == a.length - 1) {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }

    static int isDigitIncreasing(int n) {

        for (int index = 1; index < 9; index++) {
            int product = 0;
            int sum = 0;
            while (sum < n) {
                product = product * 10 + index;
                sum += product;
            }

            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }

    static int decodeArray(int[] a) {
        String res = "";
        for (int i = 1; i < a.length; i++) {
            res += Math.abs(a[i - 1] - a[i]);
        }
        if (a[0] < 0) {
            res = "-" + res;
        }

        return Integer.valueOf(res);
    }

    static int isCubePowerful(int n) {
        if (n <= 1) {
            return 0;
        }
        int nCopy = n;
        int sum = 0;
        while (nCopy != 0) {
            int digit = nCopy % 10;
            int sqrtValue = 1;

            for (int i = 0; i < 3; i++) {
                sqrtValue *= digit;
            }
            sum += sqrtValue;
            nCopy /= 10;
        }

        if (sum != n) {
            return 0;
        }
        return 1;
    }

    static void doIntegerBasedRounding(int[] a, int n) {
        if (n > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > 0) {
                    int base = n * (a[i] / n);
                    a[i] = Math.abs(a[i] - base) < Math.abs(a[i] - base - n) ? base : base + n;
                }

            }
        }
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

    static int[] encodeNumber(int n) {

        if (n <= 1)
            return null;

        int size = 0;
        int nCopy = n;
        for (int i = 2; i <= nCopy;) {
            if (isPrime(i) && nCopy % i == 0) {
                size++;
                nCopy /= i;
            } else
                i++;
        }

        int[] result = new int[size];
        nCopy = n;

        for (int i = 0, j = 2; i < size && j <= nCopy;) {
            if (isPrime(j) && nCopy % j == 0) {
                result[i] = j;
                i++;
                nCopy /= j;
            } else
                j++;
        }

        return result;
    }

}
