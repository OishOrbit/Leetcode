class Solution {
    public int calPoints(String[] operations) {
        int res[] = new int[operations.length];
        int k=0;
        for(String i : operations)
        {
            if(i.equals("C"))
            k--;
            else if(i.equals("D"))
            {res[k]=res[k-1]*2;k++;}
            else if(i.equals("+"))
            {res[k] = res[k-1]+res[k-2];k++;}
            else
            {res[k] = Integer.parseInt(i);k++;}
        }
        int sum = 0;
        for(int i = 0;i<k;i++)
        sum+=res[i];
        return sum;
    }
}