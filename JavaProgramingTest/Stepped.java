public class Stepped {
    public static void main(String[] args) {
        System.out.println(isStepped1(new int[] { 1, 1, 1, 5, 5, 5, 8, 8, 8 }));
    }

    static int isStepped1(int[] a) {
        int ans = 1;
        for (int i = 0; i < a.length;) {
            int count = 0;
            int j = i;
            while (j < a.length) {
                if (a[i] == a[j]) {
                    count++;
                    j++;
                } else if (a[i] > a[j]) {
                    ans = 0;
                    return ans;
                } else {
                    break;
                }
            }
            if (j == i) {
                j++;
            }
            if (count < 3) {
                ans = 0;
                break;
            }
            i = j;

        }
        return ans;
    }

}
