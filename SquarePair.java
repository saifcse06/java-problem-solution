public class SquarePair {
    public static void main(String[] args) {
        System.out.println(isSquarePair(new int[] { 9, 0, 2, -5, 7 }));
    }

    static int isSquarePair(int[] a) {
        int coount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0) {
                    if (isPerfectSquare(a[i] + a[j])) {
                        coount++;
                    }
                }
            }
        }
        return coount;
    }

    static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);

        return sqrt == (int) sqrt;
    }
}
