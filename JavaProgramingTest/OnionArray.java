public class OnionArray {
    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
        System.out.println(isOnionArray(new int[] { 1, 2, 3, 4, 15 }));
        System.out.println(isOnionArray(new int[] { 1, 3, 9, 8 }));
        System.out.println(isOnionArray(new int[] { 2 }));
        System.out.println(isOnionArray(new int[] {}));
        System.out.println(isOnionArray(new int[] { -2, 5, 0, 5, 12 }));
    }

    static int isOnionArray(int[] a) {
        if (a.length < 2) {
            return 1;
        }
        int j = 0, k = a.length - 1;

        while (j < k) {
            if (a[j] + a[k] > 10 && j + k == a.length - 1) {
                return 0;
            }
            j++;
            k--;

        }
        return 1;
    }
}
