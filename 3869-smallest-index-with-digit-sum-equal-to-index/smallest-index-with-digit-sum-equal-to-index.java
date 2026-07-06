class Solution {
    public int digsum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;int fl=0;
        for(int i =0 ; i< nums.length; i++)
        {
            if( digsum(nums[i]) == i)
            {   min = Math.min(min , i);
            fl=1;
            }
        }
        if(fl==1)
        return min;
        else
        return -1;
    }
}