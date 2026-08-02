class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = 0;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid] > nums[n-1]){
                low = mid+1;
            }else{
                res = mid;
                high = mid-1;
            }
        }

        int min = res;
        low = 0;

        high = n-1;
        int last = min-1;
        while(low<=last){
            int mid = low+(last-low)/2;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){ 
                low = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }

        high = n-1;
        while(min<=high){
            int mid = min+(high-min)/2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) min = mid + 1;
            else high = mid - 1;
        }

        return -1; 
    }
}