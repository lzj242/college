package Chapter_Six;

/**
 * @Author 墨宣
 * @Date 2021/10/12 20:18
 * 目的：把给定的学生花名册数据添加到 Map 集合中。
 */

import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClassNameSix {
    public static void main(String[] args) {


        /********** Begin **********/
        // 第一步：接收给定字符串

        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第二步：接收给定的一行字符串
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int d = 0;
        // 第二步：接收给定的一行字符串
        Map<String, String> hashMap = new HashMap<>();
        String[] sr = str.split("，");
        for (int i = 0; i < sr.length; i+=2) {

            // 第二步：切割花名册
            int j = i + 1;
            // 第三步：创建 HashMap 集合,key 为姓名，value 为年龄
            if (j < sr.length) {
                hashMap.put(sr[i], sr[j]);
            } else {
                break;
            }
        }


        // 第四步：添加数据到集合中
        System.out.print(hashMap);
        // 第五步：打印集合
    }
    /********** End **********/

}

