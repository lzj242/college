package ChapterSeven;

/**
 * @Author 墨宣
 * @Date 2021/10/15 18:40
 * 目的：
 */
import java.util.Scanner;
public class ClassSeven {

        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 第一步：创建任意方法并抛出异常
        public static int judge(){

            // 第二步：接收给定的两个字符串
            Scanner input=new Scanner(System.in);
            String str1;
            String str2;
            str1=input.next();
            str2=input.next();
            // 第三步：把第二个字符串的长度减1,得到一个整数值
            int n=str2.length()-1;
            int m;
            m=str1.length()/n;
            // 第四步：输出第一个字符串长度是整数值的多少倍
            return m;
        }

        public static void main(String[] args) {
            // 第五步：调用创建的方法，并捕获异常，输出"除数不能为0"

            try{
                int t=judge();
                System.out.print(t);
            }
            catch(Exception e){
                System.out.print("除数不能为0");
            }


        }

        /********** End **********/

    }

