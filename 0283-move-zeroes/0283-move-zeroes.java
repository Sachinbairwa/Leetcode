class Solution {
    public void moveZeroes(int[] nums) {
        int j =0; // i = "Where am I checking?" //j = "Where should I put the next useful element?"

        for(int i=0; i<nums.length;i++){

            if(nums[i]!=0){

                nums[j] = nums[i];
                j++;            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}