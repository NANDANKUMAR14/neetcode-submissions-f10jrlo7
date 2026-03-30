class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for(char ch : s.toCharArray())
        {
          t = t.replaceFirst(String.valueOf(ch),"");

        }
        if(t.isEmpty())
        {
            return true;
        }
        else
        {
        return false;
        }
    }
}
