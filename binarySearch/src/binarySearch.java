public class binarySearch {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int target = 2;
        System.out.println(search(input,target));
    }
    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length -1, target);
    }
    private static int search(int[] nums, int from, int to, int target){
        int middleIndex = (from + to) / 2;
        if (target == nums[middleIndex]){
            return nums[middleIndex];
        }

        if (from<=to){
            if (target < nums[middleIndex])
                return search(nums,from,middleIndex-1,target);
            else
                return search(nums,middleIndex+1,to,target);
        }

        return -1;
    }
}
