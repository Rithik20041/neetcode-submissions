class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer>res=new HashSet<>();
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(Math.abs(i-j)>k){
                res.remove(nums[i]);
                i++;
            }
            if(res.contains(nums[j]))return true;
            res.add(nums[j]);
        }return false;
    }
}