class Solution {
    public int climbStairs(int n) {
        if(n<=2)return n;
        int cur=2;
        int prev=1;
        int res=0;
        for(int i=3;i<=n;i++){
            res=cur+prev;
            prev=cur;
            cur=res;
        }return res;
    }
}
