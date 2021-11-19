package a;
import java.util.Scanner;
import java.lang.Object;
public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String javaname=input.next();
        String javaname2="java";
        String mailbox=input.next();
        String []java=javaname.split(".");
        int t=java.length;
        if(java[0].length()>0&&java[t-2].equals(javaname2)){
            System.out.println("Java文件名正确");
        }
        else {
            System.out.println("Java文件名无效");
        }

    }
}
