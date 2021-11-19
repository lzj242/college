package a;
/**
 * 任务：使用单路分支的 if 语句完成从控制台输入的三个数值中获取最大值的任务
 */
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner reader = new Scanner(System.in);
        a= reader.nextInt();
        b=reader.nextInt();
        c=reader.nextInt();
        max=a;
        if (max<b) {
            max=b;
        }
        if(max<c) {
            max=c;
        }
        System.out.print(max);
    }
}
