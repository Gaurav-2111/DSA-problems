class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefix = 0;
        int count = 0;
        map.put(prefix,1);
        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            if(map.containsKey(prefix - k)){
                count += map.get(prefix - k);
            }
            if(map.containsKey(prefix)){
                map.put(prefix,map.get(prefix)+1);
            }else{
                map.put(prefix,1);
            }
            
            
        }
        return count;
    }
}