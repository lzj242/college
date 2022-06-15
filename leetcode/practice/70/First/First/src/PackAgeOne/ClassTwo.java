package PackAgeOne;

import java.util.*;

/**
 * @Author : 墨宣
 * @Time : 2022/6/13 19:48
 * @File : ClassTwo
 * 任务 :
 */
public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classTwo.resolve(n));
        scanner.close();
    }

    int resolve(int n) {
        int result = 0;
        int j = n / 2;
        int k = n % 2;
        for (int i = k; i < n; i++) {
            for(int t=j;j>=0;j--){

            }
        }
        return result;
    }
}
