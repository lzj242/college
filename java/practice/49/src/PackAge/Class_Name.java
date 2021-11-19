package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/10/9 15:56
 */
import  java.util.Scanner;
public class Class_Name {
    public static void main(String[] args) {
        // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
        /********** Begin **********/
        Scanner input=new Scanner(System.in);
        char c;
        c=input.next().charAt(0);
        int b;
        b=c;
        long l;
        l=b;
        System.out.println("char类型转换为Long类型后的结果为："+l);
        // 获取键盘第一次输入的字符，将其转换为对应的 ASCII 码后，将其转换为 Long 类型
        String str;
        str=input.next();
        long l1;
        l1=Long.parseLong(str);
        float f1;
        f1=l1;
        System.out.println("Long类型转换为float类型后的结果为："+f1);
        // 获取键盘第二次输入的数字型字符串，以该值为参数创建一个 Byte 对象，最后将其转换为 float 类型


        /********** End **********/
    }
    }

