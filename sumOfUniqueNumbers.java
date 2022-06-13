import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class sumOfUniqueNumbers {

    public static int sum(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        HashMap<Integer, Integer> numCount = new HashMap<>();
        for(int num : nums) {
            if(numCount.containsKey(num)) {
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        int sum = 0;
        for(int num : numCount.keySet()) {
            if(numCount.get(num) == 1) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumOfUnique(int[] nums) {
        int[] n = new int[nums.length];
        for(int i: nums) n[i]++;
        int sum  =0;
        for(int i = 0; i<n.length; i++){
            if(n[i] == 1) {
                sum+=i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("10: " + sum(new int[]{2,3,4,3,1,5,2}));
        System.out.println("10: " + sumOfUnique(new int[]{2,3,4,3,1,5,2}));
    }
}
