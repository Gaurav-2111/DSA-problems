class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.empty() && s.charAt(i) == stack.peek()){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.empty()){
            res.append(stack.pop());
        }
        String reverse = res.reverse().toString();
        return reverse;
        
    }
}