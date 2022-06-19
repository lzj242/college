package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/14 14:03
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String string = classOne.resolve(str);
        System.out.println(string);
        scanner.close();
    }

    public String resolve(String str) {
        if (str.length() == 1) {
            return str;
        }
        if (str.length() == 2) {
            char[] c = str.toCharArray();
            if (c[0] == c[1]) {
                return str;
            } else {
                return String.valueOf(c[0]);
            }
        }
        String test = new StringBuilder(str).reverse().toString();
        if(test.equals(str)){
            return str;
        }
        String result = "";
        String string = "";
        int max = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int t = 1; i + t <= str.length(); t++) {
                string = str.substring(i, (t + i));
                test = new StringBuilder(string).reverse().toString();
                if (test.equals(string) && string.length() > max) {
                    result = string;
                    max = result.length();
                }
            }
        }
        return result;
    }
}
