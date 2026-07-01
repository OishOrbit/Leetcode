class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count =0;
        for(String i : operations)
        {
            if(i.equals("++X") || i.equals("X++"))
            count+=1;
            else
            count-=1;
        }
        return count;
    }

}