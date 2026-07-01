class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character,Integer> ans = new HashMap<>();
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
        ans.put(ch++, weights[i]);
}
        String temp="";
        for(int i=0;i<words.length;i++)
        {   int sum = 0;
            for(int j = 0;j<words[i].length();j++)
            sum+=ans.get(words[i].charAt(j));
            char c = (char)('z' - (sum % 26));
            temp+=c;
        }
        return temp;
    }
}