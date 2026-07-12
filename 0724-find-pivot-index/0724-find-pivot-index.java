class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum = 0;
        for(int i=0;i<nums.length;i++){
            total_sum += nums[i];
        }
        int left = 0;
        for(int i=0;i<nums.length;i++){
            int right = total_sum - left - nums[i];

            if(left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}