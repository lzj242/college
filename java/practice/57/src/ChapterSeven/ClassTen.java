package ChapterSeven;

/**
 * @Author 墨宣
 * @Date 2021/10/15 19:01
 * 目的：接收给定的一行字符串（某学生各科成绩），当某科成绩大于 100 或者小于 0 时，
 * 抛出一个异常（Exception）,提示“成绩录入异常”。最后统计该学生各科平均成绩。
 */
import  java.util.Scanner;
public class ClassTen {
    public static void main(String[] args)throws Exception {
        String str;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        String []sr=str.split(" ");
        int n;
        int sum=0;
        for (String st:sr){
            n=Integer.parseInt(st);
            if(n<0||n>100){
                throw new Exception("成绩录入异常");
            }
            else{
                sum+=n;
            }
        }
        System.out.println("该学生总成绩为："+sum);
    }
}
