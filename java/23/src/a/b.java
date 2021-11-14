package a;
import java.util.Scanner;
/**
 * @author HUAWEI
 */
public class b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char score = input.next().charAt(0);
        switch (score){
            case 'A':
                System.out.println("百分制分数段为90分以上");
                break;
            case 'B':
                System.out.println("百分制分数段为80-89分");
                break;
            case 'C':
                System.out.println("百分制分数段为70-79分");
                break;
            case 'D':
                System.out.println("百分制分数段为60-69分");
                break;
            case 'E':
                System.out.println("百分制分数段为60分以下");
                break;
            default:
                System.out.println("输错了，你能不能长点心");
                break;
        }
    }
}
