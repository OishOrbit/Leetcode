class Solution {
    public boolean vowel(char ch)
    {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u';
    }
    public String sortVowels(String s) {
        ArrayList<Character> temp = new ArrayList<>();
        String result="";
        for(char i:s.toCharArray())
        {
            if(vowel(i))
            temp.add(i);
        }
        Collections.sort(temp);
        int k=0;
        
        for(int i = 0 ; i<s.length();i++)
        {
            if(vowel(s.charAt(i)))
            {result+=temp.get(k);k++;}
            else
            result+=s.charAt(i);
        }
        return result;
    }
}