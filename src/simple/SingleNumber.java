package simple;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 给你一个长度为 n 的数组，其中只有一个数字出现了奇数次，其他均出现偶数次，问如何使用优秀的时空复杂度快速找到这个数字
 * @date 2019/2/27  15:01
 */
public class SingleNumber {
    public static int singleNumber2(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{1, 1, 3, 2, 2}));
    }
}
