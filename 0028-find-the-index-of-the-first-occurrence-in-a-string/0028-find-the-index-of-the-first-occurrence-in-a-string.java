class Solution {
    public int strStr(String haystack, String needle) {
        int i=0,j=0;
        while(j < haystack.length() && i < needle.length()){
            if(needle.charAt(i) == haystack.charAt(j)){
                i++;
                j++;
                if(i == needle.length()){
                    return j - i;
                }
            }else{
                j = j - i + 1;
                i=0;
            }
        }
        return -1;
    }
}