class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int i:nums)
        {
            sum+=i;
        }
            int dsum =0;
        for(int i:nums)
        {
            while(i>0)
            {
                dsum+=i%10;
                i/=10;
            }
        }
        return Math.abs(sum - dsum);
    }
}