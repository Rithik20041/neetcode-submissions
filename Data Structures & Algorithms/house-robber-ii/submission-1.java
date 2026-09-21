class Solution {
    public int clockwise(int[] nums){
        int res=0;
        int prev2=nums[0];
        int prev1=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length-1;i++){
            res=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=res;
        }
        return res;
    }
    public int anticlockwise(int[] nums){
        int res=0;
        int prev2=nums[1];
        int prev1=Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){
            res=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=res;
        }return res;
    }
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        if(nums.length==3){
            if(nums[0]>nums[1]&&nums[0]>nums[2])return nums[0];
            else if(nums[1]>nums[0]&&nums[1]>nums[2])return nums[1];
            else return nums[2];
        } 
        int x=clockwise(nums);
        int y=anticlockwise(nums);
        return Math.max(x,y);
    }
}
