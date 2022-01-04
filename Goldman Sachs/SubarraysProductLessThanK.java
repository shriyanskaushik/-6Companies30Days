public class SubarraysProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            ans += right - left + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 10;
        System.out.println(numSubarrayProductLessThanK(arr, k));
    }
}
