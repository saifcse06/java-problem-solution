public class DecodeArray {
    public static void main(String[] args) {
        System.out.println(decodeArray2(new int [] {0, -3, 0, -4, 0}));
    }

    static int decodeArray(int [] a){
        int sum = 0;

        for (int i = a.length - 1; i > 0; i--) {
            int digit = (a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);

            for (int j = i; j < a.length - 1; j++) {
                digit *= 10;
            }
            sum += digit;
        } 

        if (a[0] < 0) return -sum;
        return sum;
    }
    static int decodeArray2(int[] a) {
        String res = "";
        for (int i = 1; i < a.length; i++) {
            res += Math.abs(a[i - 1] - a[i]);
        }
        if (a[0] < 0) {
            res = "-" + res;
        }
        return Integer.valueOf(res);
    }
}
