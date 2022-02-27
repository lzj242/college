package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/18 11:27
 * 目的：
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ClassTwo extends Exception{
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        try {
            int a=scans.nextInt();
            char judge=scans.next().charAt(0);
            int b=scans.nextInt();
            switch (judge){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("error");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        catch (ArithmeticException e1){
            e1.printStackTrace();
            System.out.println("算术异常");
        }
        finally {
            System.out.println("program over");
        }
    }
}
