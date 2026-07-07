class Solution {
    public long sumAndMultiply(int n) {
        long newnum = 0;
        int sum = 0;
        String num="";
        if(n==0)
        return 0;
        while( n > 0 )
        {
            if( n %10 !=0)
            {sum+= n %10;
            num=n%10 + num;
            }
            n/=10;
        }
        newnum = Long.parseLong(num);

        return newnum*sum;
    }
}