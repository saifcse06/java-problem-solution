public class GuthrieIndex {
    public static void main(String[] args) {
        // System.out.println(guthrieIndex(3));
        System.out.println(isGuthrieSequence1(new int[] { 8, 4, 2, 1 }));
    }

    static int guthrieIndex(int n) {
        int guthrieIndex = 0;

        while (n > 1) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = ((n * 3) + 1);
            guthrieIndex++;
        }
        return guthrieIndex;
    }

    static int isGuthrieSequence(int[] a) {
        if (a[a.length - 1] != 1)
            return 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != (a[i] / 2))
                    return 0;
            } else {
                if (a[i + 1] != ((a[i] * 3) + 1))
                    return 0;
            }
        }
        return 1;
    }

    static int isGuthrieSequence1(int[] a) {
        if (a[a.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0) {
                if (a[i + 1] != (a[i] / 2)) {
                    return 0;
                }
            } else {
                if (a[i + 1] != ((a[i] * 3) + 1)) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
