class Solution {
    public void moveZeroes(int[] nums) {
        int i,j =-1;
        int temp;
        for(i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break;
               
            }
        }
        if(j==-1){
            return ;
        }
        for(i=j+1;i<nums.length;i++){
             if(nums[i] != 0){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
        }
    }
}