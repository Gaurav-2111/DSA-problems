class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        
        int n = nums2.length;
        for(int i = n-1 ; i>=0 ; i--){
            while(!stack.empty() && stack.peek() < nums2[i]){
                stack.pop();
            }
            if(stack.empty()){
                map.put(nums2[i] , -1);
            }else{
                map.put(nums2[i] , stack.peek());
            }
            stack.push(nums2[i]);
        }
        int [] result = new int[nums1.length];
        int m = nums1.length;
        for(int i=0;i<m;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}