package a;
import java.util.Scanner;
import java.lang.Object;
public class b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();
        System.out.print("获取第一个字符串：");
        System.out.println(str1);
        System.out.print("获取第二个字符串：");
        System.out.println(str2);
        System.out.println("使用==比较的结果:"+(str1==str2));
        System.out.println("使用equals比较的结果:"+str1.equals(str2));
    }
}
