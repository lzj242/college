package ChapterSeven;

/**
 * @Author 墨宣
 * @Date 2021/10/15 19:11
 * 目的：接收给定的一行字符串(用户名)，自定义一个异常，判断用户名是否小于三位，如果用户名小于三位，就抛出自定义的异常。
 */

import java.util.Scanner;

public class ClassEleven {
    public static void main(String[] args) throws MyException {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        if (str.length() < 3) {
            throw new MyException("用户名小于三位");
        } else {
            System.out.println("用户名格式正确");
        }
    }
}
class MyException extends Exception{
    public MyException(){

    }
        public MyException(String str1){
            super(str1);
        }

}
