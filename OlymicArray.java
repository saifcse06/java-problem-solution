public class OlymicArray {
    public static void main(String[] args) {
        // System.out.println(isOlymicArray(new int[] { 3, 2, 1 }));
        System.out.println(isOlymicArray(new int[] { 1, 99, 99, 1000, 100, 10000, 2 }));
    }

    static int isOlymicArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a.length; j++) {

                if (a[j] < a[i]) {
                    sum += a[j];
                }
            }
            if (a[i] < sum) {
                return 0;
            }
        }

        return 1;
    }
}
