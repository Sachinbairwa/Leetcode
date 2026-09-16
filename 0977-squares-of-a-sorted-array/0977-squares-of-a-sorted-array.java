class Solution {
    public int[] sortedSquares(int[] nums) {


        int left =0;
        int right = nums.length-1;
        int index = nums.length-1;

        int[] ans = new int[nums.length];

        while(left<=right){
           int leftValue = Math.abs(nums[left]);
            int rightValue = Math.abs(nums[right]);
            
            if(leftValue>rightValue){
                ans [index] = leftValue*leftValue;
                left++;
            }

             else{
                ans [index] = rightValue*rightValue;
                right--;
            }
            index--;


        }

        return ans;
        



    }
}