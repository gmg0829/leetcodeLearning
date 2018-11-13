package middle;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 移除K位数字求最小值
 * @date 2018/11/13  9:01
 */
public class RemoveKDigits {

    public static String removeKdigits(String num, int k) {
        int digits = num.length() - k;
        char[] stack = new char[num.length()];
        int top = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (top > 0 && stack[top - 1] > c && k > 0) {
                top--;
                k--;
            }
            stack[top++] = c;
        }

        int index = 0;
        while (index < digits && stack[index] == '0') {
            index++;
        }
        return index == digits ? "0" : new String(stack, index, digits - index);
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1593212",3));
        System.out.println(removeKdigits("30200",1));
        System.out.println(removeKdigits("10",2));
        System.out.println(removeKdigits("541270936",3));
    }
}
