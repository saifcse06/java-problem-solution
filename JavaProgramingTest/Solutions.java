
public class Solutions {
    static int number1 = 0, number2 = 1, number3 = 0;

    /*
     * Q:01
     */
    public static int checkPrimeNumber(int n) {
        if (n == 1) {
            return 0;
        }
        for (int index = 2; index <= n / 2; index++) {
            if (n % index == 0) {
                return 0;
            }
        }
        return 1;
    }

    /*
     * Q:02
     */
    public static int Palindrome(int n) {
        int temp = n;
        int newnumber = 0;
        while (temp >= 1) {
            int remainNumber = temp % 10;
            newnumber = newnumber * 10 + remainNumber;
            temp = temp / 10;
        }
        if (newnumber == n) {
            return 1;
        } else {
            return 0;
        }
    }
    /*
     * Q:03
     */

    public static int Factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }

    /*
     * Q:04
     */
    public static int armstrongCheck(int n) {
        int temp = n, isArmst = 0, sum = 0, count = 0;

        while (n != 0) {
            n = n / 10;
            count = count + 1;
        }
        while (temp > n) {
            int remain = temp % 10;
            sum = (int) (sum + Math.pow(remain, count));
            temp = temp / 10;
        }
        if (n == temp)
            isArmst = 1;
        return isArmst;
    }

    /*
     * Q:05
     */
    static void Fibonacci(int n) {
        if (n > 0) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.print(" " + number3);
            Fibonacci(n - 1);
        }
    }
    /*
     * Q:06
     */

    public static int reverseNumber(int n) {
        int revNumber = 0, remain = 0;
        while (n >= 1) {
            remain = n % 10;
            revNumber = revNumber * 10 + remain;
            n = n / 10;
        }
        return revNumber;
    }

    static String duplicateString(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    return str[j];
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(duplicateString(new String[] { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" }));
        // System.out.println(checkPrimeNumber(4));
        // System.out.println(Palindrome(131));
        // System.out.println(Factorial(5));
        // System.out.println(armstrongCheck(135));
        // Fibonacci(10);
        // System.out.println(reverseNumber(123));
    }
}