package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/22 15:39
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(classOne.resolve(n));
    }

    int resolve(int n) {
        int j = 0, k = 0, result = 0;
        while (true) {
            j = n / 2;
            k = n % 2;
            result += j;
            if(j==0&&k==1){
                return result;
            }
            n = j + k;
        }
    }
}
