class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int output = Integer.MAX_VALUE;
        int differ = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    int dif = Math.abs(sum - target);
                    if(dif < differ){
                        output = sum;
                        differ = dif;
                        
                    }
                    j++;
                }else{
                    int dif = Math.abs(sum - target);
                    if(dif < differ){
                        output = sum;
                        differ = dif;
                    }
                    k--;
                }
            
            }

        }

        return output;
    }
}