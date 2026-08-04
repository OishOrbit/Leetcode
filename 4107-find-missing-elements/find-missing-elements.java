class Solution {
    public boolean found(int[] arr , int n)
    {
        for(int i: arr)
        {
            if(i ==n)
            return true;
        }
        return false;
    }
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList();
        Arrays.sort(nums);
        
        for(int i = nums[0];i<nums[nums.length - 1];i++)
        {
            if(!found(nums,i))
            list.add(i);
        }
        return list;
    }   
}