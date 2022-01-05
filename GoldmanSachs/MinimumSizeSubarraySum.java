public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0,left = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, arr));
    }
}
