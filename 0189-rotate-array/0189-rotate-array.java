class Solution {
    public void rotate(int[] nums, int k) {
        int[] num = new int[nums.length];
        int i;
        for(i=0;i<nums.length;i++){
            num[(i+k)%nums.length] = nums[i];
        }
        for(i=0;i<nums.length;i++){
            nums[i] = num[i];
        }

    }
}