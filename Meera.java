
public class Meera {
    public static void main(String[] args) {
        System.out.println(isMeeraArray(new int[] { 7, 6, 0, 10, 1 }));
    }

    static int isMeeraArray(int[] a) {
        int isPrimeCount = 0, iszerocount = 0, flag = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                iszerocount++;
            } else {
                for (int j = 2; j * j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                isPrimeCount++;
            }
        }
        if ((isPrimeCount > 0 && iszerocount > 0) || (isPrimeCount == 0 && iszerocount == 0)) {
            return 1;
        }

        return 0;
    }
}
