package a;
/**
 * 任务：变量 a 是一个 double 型的变量，请将其强转为 int 型，
 * 变量 b 是一个 short 型的变量，请将其转换为 double 型。
 * 输出格式：先换行输出变量 a 转换后的结果，再不换行输出 b 转换后的结果。
 * 类名为：Transform
 */
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        double a,d;
        short b;
        int c;
        Scanner reader=new Scanner(System.in);
        a=reader.nextDouble();
        b=reader.nextShort();
        c=(int)a;
        d=b;
        System.out.println(c);
        System.out.println(d);
    }
}
