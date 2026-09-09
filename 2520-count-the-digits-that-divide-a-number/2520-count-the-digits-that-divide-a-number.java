class Solution {
    public int countDigits(int num) {
       int original = num;
        int Count = 0;
        while(num>0){
            int digit = num%10;
            if(digit!=0&& original %digit==0){
                Count++;
            }
            num = num/10;
        }
       // System.out.println(Count);

        return Count;

    }
    
}