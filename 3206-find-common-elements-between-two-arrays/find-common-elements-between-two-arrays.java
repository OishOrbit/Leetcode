class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res[] = new int[2];
        int count=0;
        for(int i : nums1)
        {
            for(int j : nums2)
            {
                if( i == j)
                {count++;break;}
            }
        }
        res[0] = count;
        count=0;
        for(int i : nums2)
        {
            for(int j : nums1)
            {
                if( i == j)
                {count++;break;}
            }
        }
        res[1] = count;
        return res;
    }
}