class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer>res=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        res.put(nums[i],res.getOrDefault(nums[i],0)+1);
       } 
       for(int i=0;i<res.size();i++){
        if(res.get(nums[i])>1)return true;
       }return false;
    }
}
