public class CubePowerful {
    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
    }

    public static int isCubePowerful(int n) {
        int sumResult = 0, nCopy = n;
        if (n <= 0) {
            return 0;
        }
        while (nCopy > 0) {
            int temValue = nCopy % 10;
            nCopy /= 10;
            int temSumValue = 1;
            for (int i = 0; i < 3; i++) {
                temSumValue *= temValue;
            }
            sumResult += temSumValue;
        }
        return n == sumResult ? 1 : 0;
    }
}
