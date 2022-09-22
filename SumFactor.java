public class SumFactor {
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
    }

    public static int sumFactor(int[] a) {
        int sum = 0;
        int result=0;
        for (int i : a) {
            sum += i;
        }
        for (int i : a) {
            if (i == sum) {
                result++;
            }
        }
        return result;
    }
}
