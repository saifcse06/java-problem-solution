public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(4));
    }

    static int isSquare(int n) {
        int i = 1;
        while (i * i <= n) {
            if (i * i++ == n) {
                return 1;
            }
        }
        return 0;
    }
}
