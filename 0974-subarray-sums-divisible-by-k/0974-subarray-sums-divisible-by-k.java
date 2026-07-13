class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int result = 0;
        map.put(prefix,1);
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            
            int rem = prefix % k;
            if(rem < 0){
                rem = rem + k;
            }
            if(map.containsKey(rem)){
                result += map.get(rem);
            }
            if(map.containsKey(rem)){
                map.put(rem,map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
            
        }    
        return result;
    }
}