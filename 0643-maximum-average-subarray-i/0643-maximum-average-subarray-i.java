class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        //first window
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }

        int maxsum = sum;

        //second window
        for(int i = k;i<nums.length; i++){
            sum = sum -nums[i-k] + nums[i];

            maxsum = Math.max(maxsum , sum);
        }

        return(double)maxsum/k;
    }
}