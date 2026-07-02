class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<>(); 
        int i=0,j=0;
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < n && j < m){

            if(nums1[i] == nums2[j]){
                nums.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
            
            
        }
        i = 0;
        int[] result = new int[nums.size()];
        for(int x : nums){
            result[i] = x;
            i++;
        }
        return result;
    }
}