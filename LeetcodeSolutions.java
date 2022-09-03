public class LeetcodeSolutions {
    /*
    * 14. Longest Common Prefix
    *https://leetcode.com/problems/longest-common-prefix/
    */
    public static String  longestCommonPrefix(String [] strs) {
        String longestString = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(longestString))
            { 
               longestString = longestString.substring(0, longestString.length()-1);
            }
        }
        return longestString;
    }  
    /*
     * 724. Find Pivot Index
     * https://leetcode.com/problems/find-pivot-index/
     */

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int lsum = 0;
        for(int i = 0; i < nums.length; i++){ 
            if(lsum * 2 == sum - nums[i]){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
       //System.out.println(longestCommonPrefix(new String[]  {"flot","flpl","flight"})); 
       //System.out.println(pivotIndex(new int [] {1,7,3,6,5,6}));
    }
}