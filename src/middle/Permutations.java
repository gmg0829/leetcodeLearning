package middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 无重复数全排列
 * @date 2018/10/18  18:01
 */
public class Permutations {
    public static void permutation1(String str ,String result ,int len){
        /* 全排列 递归实现
      递归树：
          str:          a            b                c
                      ab ac         ba   bc         ca   cb
        result:        abc acb        bac    bca      cab   cba
         */

        //结果 开始传入""   空字符进入   len   是这个数的长度
        if(result.length()==len){            //表示遍历完了一个全排列结果
            System.out.println(result);
        }
        else{
            for(int i=0;i<str.length();i++){
                if(result.indexOf(str.charAt(i))<0){    //返回指定字符在此字符串中第一次出现处的索引。
                    //System.out.println("字母："+str.charAt(i));
                    permutation1(str, result+str.charAt(i), len);
                }
            }
        }
    }



    public static void main(String args[]) throws Exception {
        String s = "abc";
        String result = "";
        permutation1(s, result, s.length());
    }
}