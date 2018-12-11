package simple;

import java.util.Stack;

/**
 * Created by gmg on 2018/12/11.
 * 有效括号
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([]"));
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char topChar = stack.pop();
                if(ch == ')' && topChar != '('){
                    return false;
                }else if(ch == ']' && topChar != '['){
                    return false;
                }else if(ch == '}' && topChar != '{'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
