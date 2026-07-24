class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i) , 1);
            }
            
        }
        boolean odd = false;
        int result = 0;
        for(char ch:map.keySet()){
            if(map.get(ch) % 2 == 0){
                result += map.get(ch);
            }else{
                result += map.get(ch) - 1;
                odd = true;
            }
        }
        if(!odd){
            return result;
        }
        return result+1;
        
    }
}