package PackAge_2;

/**
 * @Author 墨宣
 * @Date 2021/10/11 14:48
 */
import  java.util.Scanner;
public class ClassName_2 {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        int ge=n%10;
        int shi=n/10%10;
        int bai=n/100;
        System.out.printf("%d %d %d",ge,shi,bai);
    }
}
