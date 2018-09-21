package simple;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/20  17:57
 */
public class ReverseInteger {
    public static int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(120));
    }
}
