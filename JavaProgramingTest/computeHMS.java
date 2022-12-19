import java.util.Arrays;

public class computeHMS {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(isComputeHMS(3735)));
        System.out.println(Arrays.toString(isComputeHMS(3650)));
        }

    static int[] isComputeHMS(int seconds){
        int [] result = new int[3];
        int s = seconds / 3600;
        result[0] = s;
        int m = (seconds % 3600)/60; 
        result[1] = m;
        int h = seconds % 60;  
        result[2] = h;  
        return result;
    }
}
