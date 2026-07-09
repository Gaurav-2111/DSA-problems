class Solution {
    public int maximumSum(int[] nums) {
        int nodel = nums[0];
        int onedel = Integer.MIN_VALUE;
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            int prevdel = nodel;
            nodel = Math.max(nums[i] + nodel , nums[i]);
            if(onedel == Integer.MIN_VALUE){
                onedel = prevdel;
            }else{
                onedel = Math.max(onedel + nums[i] , prevdel);
            }
            
            result = Math.max(result,Math.max(nodel , onedel));
        }
        return result;
    }
}