package a;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        byte bVar;
        int iVar;
        long lVar;
        float fVar;
        double dVar;
        String str;
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        str=reader.next();
        System.out.println("请输入一个字节型数据");
        bVar=reader.nextByte();
        System.out.println("请输入一个整数数据");
        iVar=reader.nextInt();
        System.out.println("请输入一个长整型数据");
        lVar=reader.nextLong();
        System.out.println("请输入一个float数据");
        fVar=reader.nextFloat();
        System.out.println("请输入一个double数据");
        dVar=reader.nextDouble();
        System.out.println(str+"先生你好！您输入的数据如下：");
        System.out.println("字符型数据"+bVarl);
        System.out.println("整型数据"+iVar);
        System.out.println("长整型数据"+lVar);
        System.out.println("float数据"+fVar);
        System.out.println("double数据"+dVar);
    }
}
