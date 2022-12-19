public class InertialArray {
    public static void main(String[] args) {
        System.out.println(isInertial(new int[] { 11, 4, 20, 9, 2, 8 }));
    }

    static int isInertial(int[] a) {
        boolean oddFlag = false;
        int maxEven = Integer.MIN_VALUE;
        int secondMaxEven = maxEven;
        int minOdd = Integer.MAX_VALUE;

        for (int anA : a) {
            if (anA % 2 != 0) {
                oddFlag = true;
                if (anA < minOdd)
                    minOdd = anA;
            } else {
                if (anA > maxEven) {
                    secondMaxEven = maxEven;
                    maxEven = anA;
                } else if (anA > secondMaxEven && anA < maxEven) {
                    secondMaxEven = anA;
                }
            }
        }
        if (oddFlag && minOdd > secondMaxEven && maxEven > minOdd)
            return 1;
        return 0;
    }
}
