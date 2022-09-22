public class PrimeCount {
    public static void main(String[] args) {
        //System.out.println(primeCount(10, 30));
         System.out.println(isNPrimeable(new int[] {5,15,27}, 3));
    }

    static int primeCount(int start, int end){
        int result = 0;
        if (end == 1) {
            return 0;
        }
        if (start < 1) {
            start = 2;
        }
        for (; start <= end; start++) {
            boolean isPrime = true;
            for (int i = 2; i < start; i++) {
                if (start % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                result ++;
            }
        }
        return result;
    } 

    static int isNPrimeable(int[] a, int n){
        int isPrime = 1;  
            for (int i = 0; i < a.length; i++) {
                 for (int j = 2; j < a[i] + n; j++) {
                    if ((a[i] + n) % j == 0) {
                        isPrime = 0; 
                    }
                }
            }
        return isPrime;
    }
}
