class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>res=new HashSet<>();
        int l=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            while(res.contains(s.charAt(i))){
                res.remove(s.charAt(l));
                l++;
            }
            res.add(s.charAt(i));
            c=Math.max(c,i-l+1);
        }return c;
    }
}
