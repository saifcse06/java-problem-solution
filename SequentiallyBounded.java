public class SequentiallyBounded {
    public static void main(String[] args) {
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 99, 99, 99, 99, 99}));
        System.out.println(isSequentiallyBounded(new int[]{2, 3, 3, 3, 3}));
        System.out.println(isSequentiallyBounded(new int[]{12, 12, 9}));
        System.out.println(isSequentiallyBounded(new int[]{0}));
        System.out.println(isSequentiallyBounded(new int[]{0, 1}));
        System.out.println(isSequentiallyBounded(new int[]{-1, 2}));
        System.out.println(isSequentiallyBounded(new int[]{}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 5}));
        System.out.println(isSequentiallyBounded(new int[]{5, 5, 5, 2, 5}));
    }

    public static int isSequentiallyBounded(int[] a) {
        int countSequence = 1;

        if (a.length == 1 && a[0] <= 0)
            return 0;

        for (int index = 0; index < a.length - 1; index++) {
            if (a[index] > a[index + 1])
                return 0;

            if (a[index] == a[index + 1])
                countSequence++;
            else
                countSequence = 1;

            if (a[index] <= countSequence)
                return 0;
        }
        return 1;
    }

}
