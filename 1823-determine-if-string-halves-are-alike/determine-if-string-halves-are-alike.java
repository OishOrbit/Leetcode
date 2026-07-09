class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2),b=s.substring(s.length()/2);
        int count1=0,count2=0;
        for(char ch:a.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            count1++;
        }
        for(char ch:b.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            count2++;
        }
        return count1==count2;
    }
}