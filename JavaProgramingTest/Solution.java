
class RepsEqual {
    public static void main(String[] args) {
        // System.out.println(repsEqual(new int[] { 1, 3, 2, 0, 5, 3 }, 32053));
        System.out.println(removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }

    static int removeElement(int[] nums, int val) {
        int newNums[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newNums[i] = nums[i];
            }
        }
        return newNums.length;
    }

    static int repsEqual(int[] a, int n) {

        for (int i = a.length - 1; i >= 0; i--) {
            int temVal = n % 10;
            n /= 10;
            if (a[i] != temVal) {
                return 0;
            }
        }
        if (n != 0) {
            return 0;
        } else {
            return 1;
        }

    }
}