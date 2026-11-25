class Solution {
    public int reverse(int x) {
        int num =x;
        int ans = 0;

        while(num>0){
            int rem = num%10;
            num = num/10;

            ans = ans *10 + rem;
        }
        System.out.print(ans);

        return ans;
    }
}