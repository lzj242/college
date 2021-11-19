package first;
import java.util.Scanner;

/**
 * @author HUAWEI
 */
public class second {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t,a;
        double x;
        a=input.nextInt();
        t=input.nextInt();
        x=8*t+0.5*a*t*t;
        System.out.print("当时间为"+t+"，加速度为"+a+"时，距离为"+x);

    }
}
