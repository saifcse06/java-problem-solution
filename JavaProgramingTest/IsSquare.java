/**
 * IsSquare
 */
public class IsSquare {

    public static void main(String[] args) {
        System.out.println(isSquare(8));
    }

    static int isSquare(int n){
        int i = 0;
        while (i * i <= n) {
            if (i * i++ == n) {
                return 1;
            }
        }

        return 0;
    }
}