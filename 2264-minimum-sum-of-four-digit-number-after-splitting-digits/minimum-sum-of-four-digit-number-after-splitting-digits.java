class Solution {
    public int minimumSum(int num) {
        int res[] = new int[4];
        int k=0;
        while(num>0)
        {
            res[k++] = num % 10;
            num/=10;
        }
        Arrays.sort(res);
        int a = res[0]*10+res[2];
        int b  = res[1]*10+res[3];
        return a+b;
    }
}