package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/19 16:48
 * @File : ClassThree
 * 任务 :
 */

import java.util.*;

public class ClassThree {
    public static void main(String[] args) {
        ClassThree classThree = new ClassThree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classThree.resolve(n));
        scanner.close();
    }

    public boolean resolve(int n) {
        boolean result = false;
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 2 == 0) {
            return judge(n);
        } else {
            return false;
        }
    }

    boolean judge(int n) {
        boolean result = false;
        while (true) {
            n /= 2;
            if (n == 1) {
                result = true;
                break;
            }
            if(n%2!=0){
                break;
            }
        }
        return result;
    }
}
