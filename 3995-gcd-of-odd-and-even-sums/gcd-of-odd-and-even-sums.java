class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddno = 1, eveno = 2;
        int oddsum=0,evensum=0;
        int i =1;
        while(i<=n)
        {
            i++;
            oddsum+=oddno;
            oddno+=2;
            evensum+=eveno;
            eveno+=2;
        }
        while(evensum!=0)
        {
            int c = evensum;
            evensum = oddsum % evensum;
            oddsum = c;
        }
        return oddsum;
    }
}