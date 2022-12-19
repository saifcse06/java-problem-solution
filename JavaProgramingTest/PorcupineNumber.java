public class PorcupineNumber {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(139));
    }

    static int findPorcupineNumber(int n) {
        int porcupine = n + 1;

        while (true) {
            if (isPrime(porcupine)) {
                int digit = porcupine % 10;
                if (digit == 9) {
                    int nextPrime = porcupine + 1;
                    while (true) {
                        if (isPrime(nextPrime)) {
                            int nextDigit = nextPrime % 10;
                            if (nextDigit == 9) {
                                return porcupine;
                            } else {
                                porcupine = nextPrime;
                                break;
                            }
                        }
                        nextPrime++;
                    }
                }
            }
            porcupine++;
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

}
