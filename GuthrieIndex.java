public class GuthrieIndex {
    public static void main(String[] args) {
        System.out.println(guthrieIndex(3));
    }

    static int guthrieIndex(int n){
        int guthrieIndex = 0;

        while (n > 1) {
            if (n % 2 == 0)
                n /= 2;
            else n = ((n * 3) + 1);
            guthrieIndex++;
        }
        return guthrieIndex;
    }
}

