class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map= new HashMap<>();
        int n = magazine.length();
        boolean result = false;
        for(int i=0;i<n;i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            
        }
        for(int i=0;i<ransomNote.length();i++){
            char s = ransomNote.charAt(i);
            if(map.containsKey(s)){
                result = true;
                map.put(s , map.get(s) - 1);
                if (map.get(s) == 0) {
                    map.remove(s);
                }
            }else{
                result = false;
                break;
            }
        }
        return result;
        
    }
}