class Solution {
    public int countdig(int n)
    {
        int count = 0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    public int digsum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public boolean symmetric(int num)
    {
        int no = countdig(num);
        if(no % 2 !=0)
        return false;
        int k = (int)Math.pow(10,no/2);
        int last = num % k; 
        int first = num /k;
        return (digsum(last) == digsum(first));
        
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i<=high;i++)
        {
            if(symmetric(i))
            count++;
        }
        return count;
    }
}