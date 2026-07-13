class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int result =0;
        map.put(0, -1);
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                sum -= 1;
            }
            if(nums[i] == 1){
                sum += 1;
            }
            // int sum = zero + one;
            if(map.containsKey(sum)){
                int length = i - map.get(sum);
                result = Math.max(result,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            

        }
        return result;
        
    }
}