class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list =new ArrayList<>();
        int freq[] = new int[nums.length+1];
        for(int i :nums)
        freq[i-0]++;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==2)
            list.add(i);
        }
        return list;
    }
}