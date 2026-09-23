class Solution {
    public int minSubArrayLen(int target, int[] nums) {


        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {

            right = i;
            sum += nums[i];

            while(sum >= target) {

                ans = Math.min(ans, right - left + 1);

                sum -= nums[left];
                left++;
            }
        }

        if(ans == Integer.MAX_VALUE) {
            return 0;
        }

        return ans;
        


    }
}