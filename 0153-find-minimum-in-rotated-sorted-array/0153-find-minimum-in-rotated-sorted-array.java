class Solution {
    public int findMin(int[] nums) {
        int i=0;
        int j=1;
        while(j < nums.length){
            if(nums[i] < nums[j]){
                j++;
            }else if(nums[i] > nums[j]){
                i = j;
                j++;
            }
        }
        return nums[i];
    }
}