class Solution {
    public int findMin(int[] nums) {
            int p=Integer.MAX_VALUE,vp=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<p){
                p=nums[i];
                nums[i]=vp;
             
            }else if(nums[i]<vp && nums[i]!=p){
                vp=nums[i];
            }
        }
        return p;
        
    }
}