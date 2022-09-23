public class IsLegalNumber {
    public static void main(String[] args) {
        //System.out.println(isLegalNumber(new int[] {3, 2, 1}, 4));
        System.out.println(convertToBase10(new int[  ] {1, 0, 1, 1}, 2));
    }
    static int convertToBase10(int[] a, int base) {
        if (isLegalNumber(a, base) == 1) {
            int base10 = 0;
            for (int i = 0; i < a.length; i++) {
                int baseProd = 1;
                for (int j = i + 1; j < a.length; j++) {
                    baseProd = base * baseProd;
                }
                base10 += a[i] * baseProd;
            }
            return base10;
        }
        return -1;
    }
    static int isLegalNumber(int[] a,int n){
        for (int anA : a) {
            if (anA < 0 || anA > n)
                return 0;
        }
        return 1; 
    }
}
