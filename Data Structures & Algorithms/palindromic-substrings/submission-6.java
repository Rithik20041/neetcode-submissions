class Solution {
    public boolean palindrome(String s){
        int i=0,j=s.length()-1,c=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }return true;
    }
    public int countSubstrings(String s) {
        if(s.length()<=1||s==null)return s.length();
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(palindrome(s.substring(i,j)))c++;
            }
        }return c;
    }
}
