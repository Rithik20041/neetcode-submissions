class Solution {
    public int numDecodings(String s) {
        if(s.length()==1)return s.charAt(0)=='0'?0:1;
        int prev=1;
        int cur=s.charAt(0)=='0'?0:1;
        for(int i=2;i<=s.length();i++){
            int res=0;
            int one=Integer.parseInt(s.substring(i-1,i));
            int two=Integer.parseInt(s.substring(i-2,i));
            if(one>=1)res+=cur;
            if(two>=10&&two<=26)res+=prev;
            prev=cur;
            cur=res;
        }return cur;
    }
}
