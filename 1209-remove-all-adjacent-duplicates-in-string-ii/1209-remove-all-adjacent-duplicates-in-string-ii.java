class Pair{
    char ch;
    int count;
    Pair(char ch ,int count){
        this.ch = ch;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack <Pair> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            
            if(!stack.empty() && stack.peek().ch == s.charAt(i) && stack.peek().count == k-1){
                stack.pop();
                continue;
            }
            
            if(stack.empty()){
                stack.push(new Pair(s.charAt(i) , 1));
            }
            else if(stack.peek().ch != s.charAt(i)){
                stack.push(new Pair(s.charAt(i) , 1));
            }
            else if (stack.peek().ch == s.charAt(i)){
                stack.peek().count++;
            }
            
        }
        StringBuilder result = new StringBuilder();

        while (!stack.empty()) {
            Pair p = stack.pop();

            for (int i = 0; i < p.count; i++) {
                result.append(p.ch);
            }
        }

        return result.reverse().toString();
        
    }
}