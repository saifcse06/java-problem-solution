public class ArrayTypeProblem {
    public static void main(String[] args) {
        // System.out.println(removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
        // System.out.println(twoSum(new int[] { 2, 7, 11, 15 }, 9));
        // System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4
        // }));
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else {
                if (nums[i] > target) {
                    return i;
                }
            }
        }
        return 1;
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[k] != nums[i]) {
                    nums[++k] = nums[i];
                }
            }
            return k + 1;
        }

    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return nums;

    }

    static int removeElement(int[] nums, int val) {
        int nextIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[nextIndex] = nums[i];
                nextIndex++;
            }
        }

        return nextIndex;
    }

}
