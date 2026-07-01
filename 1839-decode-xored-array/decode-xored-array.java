class Solution {
    public int[] decode(int[] encoded, int first) {
        int result[] = new int[encoded.length+1];
        result[0]=first;
        int k=1;int res = first;
        for(int i = 0;i<encoded.length;i++)
        {
            res^=encoded[i];
            result[k++]= res;
        }
    return result;
    }
}