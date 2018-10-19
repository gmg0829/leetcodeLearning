package simple;

import java.util.HashMap;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 两数之和
 * @date 2018/9/20  17:40
 */
public class TwoSum {
    /**
     * 如果符合条件的不止一组呢？则找到一组就从map删除一组
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[] {
                        i, index
                };
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int []nums = {2, 7, 11, 15};
        int target = 26;
        int[] a=TwoSum.twoSum(nums,target);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
