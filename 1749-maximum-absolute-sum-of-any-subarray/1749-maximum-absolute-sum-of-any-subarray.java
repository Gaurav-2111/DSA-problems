class Solution {
    public int maxAbsoluteSum(int[] nums) { 
        int currentMax = 0;
        int currentMin = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int current = 0;
        for(int num : nums){
            current += num;

            currentMax = Math.max(num, currentMax + num);
            max = Math.max(max, currentMax);

            currentMin = Math.min(num, currentMin + num);
            min = Math.min(min, currentMin);



        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}