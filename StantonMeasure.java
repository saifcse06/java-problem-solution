public class StantonMeasure {
    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
    }

    static int stantonMeasure(int[] a){
        int count1=0,result=0;
        for (int i : a) {
            if (i == 1) {
                count1 ++;
            }
        }
        for(int i : a){
            if (i == count1) {
                result++;
            }
        }
        return result;
    }
}
