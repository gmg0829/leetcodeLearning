package simple;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:不带重复字符的最长子字符串的长度
 * @date 2018/10/17  11:32
 */
        public class LengthOfLongestSubstring {
            public static int lengthOfLongestSubstring(String s) {
                int len;
                if (s == null || (len = s.length()) == 0) return 0;
                int preP = 0, max = 0;
                int[] hash = new int[128];
                for (int i = 0; i < len; ++i) {
                    char c = s.charAt(i);
                    if (hash[c] > preP) {
                        preP = hash[c];
                    }
                    int l = i - preP + 1;
                    hash[c] = i + 1;
                    if (l > max) max = l;
                }
                return max;
            }

            public static void main(String[] args) {
                System.out.println(lengthOfLongestSubstring("abcabsfgdb"));
    }
}
