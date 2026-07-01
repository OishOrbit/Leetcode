class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int result[]= new int [2];
        int k=0;
        int freq[] = new int[100];
        for(int i :nums)
        freq[i-0]++;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>1)
            result[k++] = i;
        }
        return result;
    }
}