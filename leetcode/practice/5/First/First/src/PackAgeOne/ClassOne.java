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
        System.out.println(classOne.resolve(str));
        scanner.close();
    }

    public String resolve(String str) {
        String result = "";
        String string = "";
        int max = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int t = 1; i + t < str.length(); t++) {
                string = str.substring(i, (t + i + 1));
                String test = new StringBuilder(string).reverse().toString();
                if (test.equals(result)) {
                    if (result.length() > max) {
                        result = string;
                    }
                }
            }
        }
        return result;
    }
}
