class Solution {
    public int[] rearrangeArray(int[] nums) {
        int  n = nums.length;
        int [] arr = new int[n];
        int negative = 1;
        int positive = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                arr[negative] = nums[i];
                negative+=2;
            }
            else if(nums[i] >= 0){
                arr[positive] = nums[i];
                positive+=2;
            }
        }
        return arr;
    }
}