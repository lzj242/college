package PackAgeClass_3;

import java.util.Random;
import java.util.Scanner;
/**
 * @Author 墨宣
 * @Date 2021/10/12 19:58
 * 目的：
 */
public class ClassNameEight {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int guesssNumber;
        Random random = new Random();
        int luvkNumbres = random.nextInt(100)+1;
        while (true){
            guesssNumber=input.nextInt();
            if (luvkNumbres>guesssNumber){
                System.out.println("小了点哦");
            }
            else if(luvkNumbres<guesssNumber){
                System.out.println("有点大唔");
            }
            else {
                System.out.println("恭喜恭喜");
                break;
            }
        }
    }
}
