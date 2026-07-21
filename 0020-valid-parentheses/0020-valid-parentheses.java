class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if(top == '(' && ch != ')'){
                    return false;
                }
                if(top == '[' && ch != ']'){
                    return false;
                }
                if(top == '{' && ch != '}'){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}