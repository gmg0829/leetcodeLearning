package simple;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 回文数
 * @date 2018/10/15  17:38
 */
import java.util.ArrayList;
import java.util.List;


public class PalindromePartitioning {
    public static boolean isPalindromeOne(int x) {
        if (x < 0) return false;
        int copyX = x, reverse = 0;
        while (copyX > 0) {
            reverse = reverse * 10 + copyX % 10;
            copyX /= 10;
        }
        return x == reverse;
    }

    public static boolean isPalindromeTwo(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int halfReverseX = 0;
        while (x > halfReverseX) {
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }
        return halfReverseX == x || halfReverseX / 10 == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeTwo(12321));
    }
}