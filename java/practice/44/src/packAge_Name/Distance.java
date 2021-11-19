package packAge_Name;

/**
 * 任务：已知两个点 A、B 以及坐标分别为(2,3) 、(8,-5) ，求 A 和 B 两点之间的距离。
 * 类名为：Distance
 */

import java.lang.Math;

public class Distance {

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码

    /********** Begin **********/
    static double x1, x2, y1, y2;

    Distance() {
        x1 = 2;
        x2 = 8;
        y1 = 3;
        y2 = -5;
    }

    /**
     * 定义一个静态方法，该方法计算坐标两点的距离，携带四个参数，分别为x1、y1、x2、y2的值
     * 将距离结果返回，返回类型为double
     */
    static double getx(double x1, double x2, double y1, double y2) {
        double x;
        x = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        return x;
    }

    // 定义主方法
    public static void main(String[] args) {
        double S;
        // 通过类名.方法名的方式调用计算两点间距离的方法，分别将A、B的x1、y1、x2、y2的值传入该方法中
        Distance Distance1 = new Distance();
        S = Distance1.getx(x1, x2, y1, y2);
        // 不换行输出，输出格式: A、B两点的距离为xx
        System.out.println("A、B两点的距离为" + S);
    }
/********** End **********/

}
