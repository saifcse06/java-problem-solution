public class LeetcodeSolutions {
    /*
    * 14. Longest Common Prefix
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
    public static void main(String[] args) {
       System.out.println(longestCommonPrefix(new String[]  {"flot","flpl","flight"})); 
    }
}