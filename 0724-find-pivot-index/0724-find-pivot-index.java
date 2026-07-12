class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum = 0;
        for(int i=0;i<nums.length;i++){
            total_sum += nums[i];
        }
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left =0;
            }else{
                left += nums[i-1];
            }
            
            int right = total_sum - left - nums[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}