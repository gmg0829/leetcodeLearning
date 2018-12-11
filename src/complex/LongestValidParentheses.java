package complex;

import java.util.Stack;

/**
 * Created by gmg on 2018/12/10.
 */
public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(LongestValidParentheses.longestValidParentheses("(())"));
    }
    public static int longestValidParentheses(String s) {
        // 用于记录待匹配的左括号和右括号的位置
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            // 如是当前字符是右括号，而且记录栈非空。而且前一个字符是左括号
            if (s.charAt(i) == ')' && !st.isEmpty() && s.charAt(st.peek()) == '(') {
                // 左括号出栈
                st.pop();
                // 求最大值
                max = Math.max(max, i - ((st.isEmpty()) ? -1 : st.peek()));
            }
            // 其他情况就将字符入栈
            else {
                st.push(i);
            }
        }
        return max;
    }

}
