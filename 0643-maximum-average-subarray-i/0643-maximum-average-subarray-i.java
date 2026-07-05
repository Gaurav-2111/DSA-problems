class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0,high=k-1;
        double avg = 0;
        double result = 0;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = sum/k;
        result  = avg;
        while(high<nums.length){
            low++;
            high++;
            if(high < nums.length){

                sum = sum - nums[low-1] + nums[high];
                avg = sum/k;
            }
            if(result < avg){
                result = avg;
            }
        }
        return result;
    }
}