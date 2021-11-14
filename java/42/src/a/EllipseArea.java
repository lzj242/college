package a;

/**
 * 任务：已知椭圆的短半轴长为20.00，长半轴的长为15.50，计算椭圆面积。
 * 类名为：EllipseArea
 */

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
/********** Begin **********/

// 创建一个名为 EllipseArea 的公开类
public class EllipseArea {

// 定义椭圆的两个属性 ：短半轴长和长半轴长
    double shorter=20;
    double longer=15.5;
    // 定义一个显示有参构造方法，携带两个参数，分别表示为传来的短半轴的值和长半轴传来的值
    public EllipseArea() {

// 该方法实现将短半轴长和长半轴长分别初始化为携带的两个参数的值。
        this. shorter=shorter ;
        this. longer=longer ;
    }

    // 定义一个方法，该方法实现计算椭圆的面积，并将其返回，返回值类型为double
     double area(double shorter, double longer) {
        double s;
        s = 3.1415926 * shorter*longer ;
        return s;
    }

    // 定义主方法
    public static void main(String[] args) {

        double a, b;
        double S;
        // 在主方法中通过有参构造方法实例化一个对象，将椭圆的短半轴的值和长半轴的值传入其中
        EllipseArea EllipseArea1 = new EllipseArea();
        a = EllipseArea1.shorter ;
        b = EllipseArea1.longer ;
        // 调用计算椭圆的面积的方法，计算该椭圆的面积
        S = EllipseArea1.area( a,b);
        // 将计算后的结果四舍五入保留两位小数后输出，输出格式为：椭圆形的面积为xx
        System.out.printf("椭圆形的面积为%.2f", S);
/********** End **********/
    }
}