class Solution {
    public int countDigits(int num) {
        int ans = 0;
        int original = num;
        while(num >0){
            int digit = num % 10;
            if( digit != 0 && original % digit == 0){
                ans++;
            }
            num = num/10;
        }
        return ans;
    }
}