public class PrimeCount {
    public static void main(String[] args) {
        // System.out.println(primeCount(10, 30));
        // System.out.println(isNPrimeable(new int[] {5,15,27}, 3));
        System.out.println(isFactorialPrime(3));
    }

    static int primeCount(int start, int end) {
        int result = 0;
        if (end == 1) {
            return 0;
        }
        if (start < 1) {
            start = 2;
        }
        for (; start <= end; start++) {
            boolean isPrime = true;
            for (int i = 2; i < start; i++) {
                if (start % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result++;
            }
        }
        return result;
    }

    static int isNPrimeable(int[] a, int n) {
        int isPrime = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < a[i] + n; j++) {
                if ((a[i] + n) % j == 0) {
                    isPrime = 0;
                }
            }
        }
        return isPrime;
    }

    static int isHolderNumber(int n) {
        if (isPrime(n)) {
            int number = 0, product = 1;
            while (number < n) {
                product *= 2;
                number = product - 1;
            }
            if (number == n) {
                return 1;
            }
        }
        return 0;
    }

    static int isFactorialPrime(int n) {
        if (isPrime(n)) {
            int sum = 0;
            for (int i = 0; i < n && sum < n; i++) {
                sum = factorial(i) + 1;
            }
            if (sum == n) {
                return 1;
            }
        }
        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 0;
    }

    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
}
