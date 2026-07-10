class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total_sum = nums[0];
        int current = nums[0];
        int min = nums[0];
        int maxSum = nums[0];
        int currentMax = nums[0];
        for(int i=1;i<nums.length;i++){
            current += nums[i];
            total_sum += nums[i];

            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);


            current = Math.min(nums[i],current);
            min = Math.min(current,min);
        }
        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum,total_sum - min);
    }
}