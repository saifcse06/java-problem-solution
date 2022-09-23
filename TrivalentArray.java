public class TrivalentArray {
    public static void main(String[] args) {
        System.out.println(isTrivalent(new int[]{22, 19, 10, 10, 19, 22, 22, 10}));
    }

    static int isTrivalent(int[] a){
        int[] tempArray = new int[a.length];
        for (int i = 0; i < tempArray.length; i++)
            tempArray[i] = Integer.MIN_VALUE;

        int index = 0;
        for (int anA : a) {
            boolean flag = true;
            for (int k = 0; k < index; k++) {
                if (tempArray[k] == anA) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
                tempArray[index] = anA;
                index++;
            }
        }

        if (index != 3) return 0;
        else return 1;
    }
}
