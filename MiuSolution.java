public class MiuSolution {
    public static void main(String[] args) {
        //isPerfectSquare
        // System.out.println("Next perfect square to 7 is: "+ isPerfectSquare(6));
        // System.out.println("Next perfect square to 7 is: "+ isPerfectSquare(36));
        // System.out.println("Next perfect square to 7 is: "+ isPerfectSquare(0));
        // System.out.println("Next perfect square to 7 is: "+ isPerfectSquare(-5));

        // System.out.println("The upcount is "+ nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 8, 5));
        // System.out.println("The upcount is "+ nUpCount(new int[]{6, 3, 1}, 3, 6));


        // System.out.println(allpossibilities(new int[]{1, 2, 0, 3}));
        // System.out.println(allpossibilities(new int[]{3, 2, 1, 0} ));
        // System.out.println(allpossibilities(new int[]{1, 2, 4, 3} ));
        // System.out.println(allpossibilities(new int[]{0, 2, 3} ));
        // System.out.println(allpossibilities(new int[]{0} ));
        // System.out.println(allpossibilities(new int[]{} ));

        // int result = primeCount(10, 30);
		// System.out.println(result);
		// result = primeCount(11, 29);
		// System.out.println(result);
		// result = primeCount(20, 22);
		// System.out.println(result);
		// result = primeCount(1, 1);
		// System.out.println(result);
		// result = primeCount(5, 5);
		// System.out.println(result);
		// result = primeCount(6, 2);
		// System.out.println(result);
		// result = primeCount(-10, 6); 
		// System.out.println(result);


        int result = isInertial(new int[]{1});
		System.out.println(result);
		result = isInertial(new int[]{2});
		System.out.println(result);
		result = isInertial(new int[]{1, 2, 3, 4});
		System.out.println(result);
		result = isInertial(new int[]{1, 1, 1, 1, 1, 1, 2});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{2, 12, 12, 4, 6, 8, 11});
		System.out.println(result);
		result = isInertial(new int[]{-2, -4, -6, -8, -11});
		System.out.println(result);
		result = isInertial(new int[]{2, 3, 5, 7});
		System.out.println(result);
		result = isInertial(new int[]{2, 4, 6, 8, 10});
		System.out.println(result);
        
    }

    public static int isPerfectSquare(int n) {
        if(n < 0) return 0;
        int i, ans;
        for(i = 1; ; i++) {
            ans = i * i;
            if(n < ans) break;
        }
        return ans;
    } 

    public static int nUpCount(int[] a, int len, int n) {
        int i, sum = 0, count = 0, flag = 0;
        for(i = 0; i < len; i++) {
            sum += a[i];
            if(sum > n && flag == 0) {
                ++count;
                flag = 1;
            }
            if(sum <= n) flag = 0;
        }
        return count;
    }

    public static int allpossibilities(int[] a) {
        if(a.length == 0) return 0;

        int i, j, temp, result = 1;
        int[] temparray = a;

        for(i = 0; i < temparray.length; i++) {
            for(j = 0; j < temparray.length; j++) {
                if(temparray[i] < temparray[j]) {
                    temp = temparray[i];
                    temparray[i] = temparray[j];
                    temparray[j] = temp;
                }
            }
        }
        for(i = 0; i < temparray.length; i++) {
            if(temparray[i] != i) {
                result = 0;
                break;
            }
        }
        return result;
    }

	static int primeCount(int start, int end){
		int primeCount = 0;
		for(int number = start; number <= end; number++){
			if(number > 1){	
				boolean isPrime = true;
				for(int divider = 2; divider * 2 <= number; divider++){
					if(number % divider == 0){
						isPrime = false;
						break;
					}
				}
				if(isPrime){
					primeCount++;
				}
			}
		}
		return primeCount;
	}
    static int isInertial(int[] a){
		int isInertial = 0;
		boolean containsOddValue = false;
		int maxValue = Integer.MIN_VALUE;
		int[] oddValues = new int[a.length];
		int[] evenValues = new int[a.length];
		int oddValuesIndex = 0;
		int evenValuesIndex = 0;
		for(int index = 0; index < a.length; index++){
			if((a[index] % 2) != 0){
				containsOddValue = true;
				oddValues[oddValuesIndex] = a[index];
				oddValuesIndex++;
			}else{
				evenValues[evenValuesIndex] = a[index];
				evenValuesIndex++;
			}
			if(a[index] > maxValue){
				maxValue = a[index];
			}
		}
		if(containsOddValue){
			if(maxValue % 2 == 0){
				for(int oddIndex = 0; oddIndex < oddValuesIndex; oddIndex++){
					for(int evenIndex = 0; evenIndex < evenValuesIndex; evenIndex++){
						if(evenValues[evenIndex] != maxValue){
							if(oddValues[oddIndex] > evenValues[evenIndex]){
								isInertial = 1;
							}else{
								isInertial = 0;
								break;
							}
						}else{
							isInertial = 1;
						}
					}
					if(isInertial == 0){
						break;
					}
				}
			}
		}
		return isInertial;
	}
}
