import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] input = {2,5,5,11};

        System.out.println(Arrays.toString(twoSum(input, 10)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        // num & index
        HashMap<Integer, Integer> prev = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int poep = target - nums[i];
            if (prev.containsKey(poep)) {
                ans[1] = i;
                ans[0] = prev.get(poep);
                return ans;
            } else {
                prev.put(nums[i], i);
            }
        }

        return ans;
        
        //        int[] sum = new int[2];
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//                    sum[0] = i;
//                    sum[1] = j;
//                }
//            }
//        }
//        System.out.println(sum[0] + " " + sum[1]);
//        return sum;
    }
}
