class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int bananas : piles) {
            high = Math.max(high, bananas);
        }
        int result = 0;
        
        while(low<=high){
            long total = 0;
            int mid = low + (high - low)/2;
            for(int banana : piles){
                total +=(banana + mid - 1) / mid;
            }
            if(total <= h){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return result;
    }
}