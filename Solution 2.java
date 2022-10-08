class RepsEqual {
    public static void main(String[] args) {
        System.out.println(repsEqual(new int[] { 1, 3, 2, 0, 5, 3 }, 32053));
    }

    static int repsEqual(int[] a, int n) {

        for (int i = a.length - 1; i >= 0; i--) {
            int temVal = n % 10;
            n /= 10;
            if (a[i] != temVal) {
                return 0;
            }
        }
        if (n != 0) {
            return 0;
        } else {
            return 1;
        }

    }
}