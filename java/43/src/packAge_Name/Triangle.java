package packAge_Name;
/**
 * 任务：根据键盘输入的三个 double 型的数字判断其是否能构成三角形。
 * 类名为：Triangle
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Triangle {

    // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
    /********** Begin **********/
    static double a, b, c;

    /**
     * 定义一个静态方法，该方法检验三边是否能构成三角形，携带三个参数，分别为传来的三个参数，无返回值
     * 如果能构成，不换行输出：这三条边可以构成三角形
     * 如果不能，不换行输出：这三条边不能构成三角形
     */
    static void judge(double a, double b, double c) {
        double max, med, min;
        min = (a < b ? b : a) < c ? (a > b ? b : a) : c;
        med = (a < b ? (a > c ? a : (c < b ? c : b)) : (a < c ? a : (b > c ? b : c)));
        max = ((a > b ? a : b) > c ? (a > b ? a : b) : c);
        if (med + min > max && max - med < min) {
            System.out.println("这三条边可以构成三角形");
        } else {
            System.out.println("这三条边不能构成三角形");
        }
    }

    public static void main(String[] args) {


        // 定义主方法

        // 获取键盘输入的三个数
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        Triangle Triangle1 = new Triangle();
        Triangle1.judge(a, b, c);
        // 通过类名.方法名的方式调用检验三边是否能构成三角形的方法，分别将键盘输入的三个数传入该方法中
    }
    /********** End **********/
}
