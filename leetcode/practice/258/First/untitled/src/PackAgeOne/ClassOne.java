package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/19 16:11
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classOne.resolve(n));
        scanner.close();
    }

    int resolve(int n) {
        while (true){
            if(n/10==0){
                break;
            }
           n=everyoneadd(n);
        }
        return n;
    }
    int everyoneadd(int n) {
        int result=0;
        while (n!=0){
            result+=n%10;
            n/=10;
        }
        return result;
    }
}
