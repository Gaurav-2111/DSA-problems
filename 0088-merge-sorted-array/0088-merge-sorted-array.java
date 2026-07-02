class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0, i=0 , j=0;
        int [] nums = new int [m+n];
        while(i<m && j<n){
            if(nums1[i] > nums2[j]){
                nums[k] = nums2[j];
                j++;
                k++;
            }
            else{
                nums[k] = nums1[i];
                i++;
                k++;
            }
        }
        while(i<m){
            nums[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            nums[k] = nums2[j];
            k++;
            j++;
        }
        for(i=0;i<nums.length;i++){
            nums1[i] = nums[i];
        }
    }
}