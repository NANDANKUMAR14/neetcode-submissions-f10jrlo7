class Solution {
    public boolean isAnagram(String s, String t) {
        for(int i=0;i<s.length();i++)
        {  
            char sc = s.charAt(i);
            if(!(t.contains(String.valueOf(sc))))
            {
                return false;
            }

        }

    return true;
    }
}
