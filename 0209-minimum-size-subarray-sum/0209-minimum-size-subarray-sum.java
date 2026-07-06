class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int low = 0,high = 0;
        int totalcount = Integer.MAX_VALUE;
        while(high < nums.length){
            if(sum < target){

                sum = sum + nums[high];
                high++;
                    
            }
            while(sum >= target){
                sum = sum - nums[low];
                low++;
                
                int count = high - low + 1;
                if(count < totalcount){
                    totalcount = count;
                }
            }
           
        }
        return totalcount == Integer.MAX_VALUE ? 0 : totalcount;
    }
}