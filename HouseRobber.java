class HouseRobber {
    public int robFrom(int[] nums,int index){
       // base condition  and logic
       if(index >= nums.length){
        return 0;
       }
       int pick = nums[index] + robFrom(nums, index+2);
       int notpick =  robFrom(nums, index+1);

       return Math.max(pick , notpick);

    }
    public int rob(int[] nums) {
       return robFrom(nums, 0);
    }
}