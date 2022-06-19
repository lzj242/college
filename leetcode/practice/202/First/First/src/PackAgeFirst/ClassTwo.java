package PackAgeFirst;

/**
 * @Author : 墨宣
 * @Time : 2022/6/18 19:46
 * @File : ClassTwo
 * 任务 :
 */

import java.util.*;

public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        System.out.println(classTwo.resolve(scanner.nextInt()));
        scanner.close();
    }

    public boolean resolve(int n) {
        boolean result = false;
        int t;
        int judge = 0;
        int j = 10;
        while (true) {
            t = resolve1(n);
            if (t == 1) {
                result = true;
                break;
            } else {
                n = t;
            }
            judge++;
            if (judge == j) {
                //j也可以是10
                break;
            }
        }
        return result;
    }

    public int resolve1(int num) {
        int result = 0;
        String str = String.valueOf(num);
        int[] tmp = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            tmp[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            result += Math.pow(tmp[i],2);
        }
        return result;
    }
}
