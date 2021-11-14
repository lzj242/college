package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 18:48
 * 目的：死循环
 */

import java.net.Socket;
import java.util.Scanner;

public class ClassNameFour {
    public static void main(String[] args) {
//        for (;;){
//            System.out.println("Hello World");
//        }
//        while (true){
//            System.out.println("我是快乐的死循环");
//        }
        Scanner input = new Scanner(System.in);
        String password;
        String a="520";
        while (true) {
            password = input.next();
            if (password==a) {
               break;
            }
            else {
                System.out.println("错误，请重新输入");
            }
        }
        System.out.println("正确");
    }
}
