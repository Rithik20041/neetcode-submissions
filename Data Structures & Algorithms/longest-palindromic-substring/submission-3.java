class Solution {
    public boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }return true;
    }
    public String longestPalindrome(String s) {
        if(s.length()<=1||s==null)return s;
        String res="";
        for(int i=0;i<s.length()-1;i++){
            String max="";
            for(int j=i+1;j<=s.length();j++){
                boolean temp=palindrome(s.substring(i,j));
                if(temp)max=s.substring(i,j);
                if(max.length()>res.length())res=max;
                
            }
        }return res;
    }
}
