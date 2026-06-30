class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;text=text.trim();
        String words[] = text.split(" ");
        int i = 0;
        while(i < words.length)
        {   int fl= 0;
            for(int j = 0;j<words[i].length();j++)
            {
                char ch = words[i].charAt(j);
                if(brokenLetters.indexOf(ch) != -1)
                {fl= 1;break;}
            }
            if(fl==0)
            count++;

            i++;
        }
        return count;
    }
}