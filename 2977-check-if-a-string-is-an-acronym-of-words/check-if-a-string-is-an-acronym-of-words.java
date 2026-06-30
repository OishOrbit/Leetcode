class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String temp = "";
        for(String i : words)
        {
            char ch = i.charAt(0);
            temp+=ch;
        }
        if(temp.equals(s))
        return true;
        else
        return false;

    }
}