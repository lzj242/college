package PackageName;

/**
 * @author HUAWEI
 */
/**
 * 任务：已知一个球的半径为 12.0，求该球的表面积。
 * 类名为：Sphere
 */
import jdk.internal.org.objectweb.asm.tree.ClassNode;

import java.lang.Math;
public class ClassName {

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码

/********** Begin **********/

    // 定义圆的半径和π，π为 Math中的π
        double r=12.0,π=Math.PI;

    // 无参构造
    ClassName()
    {

    }

    // 有参构造
    ClassName(double r,double π)
    {

    }

    /**
     * 定义一个方法，该方法实现计算球的表面积，返回值为double，携带一个参数，为球的半径
     */
    public double area(double r)
    {
        double areasq;
        areasq=4*π*r*r;
        return  areasq;
    }

    public static void main(String[] args) {
        ClassName className = new ClassName();
        double result;
        result = className.area(className.r);
        System.out.printf("%.2f", result);
    }

    // 通过无参构造创建球对象


    // 调用计算球面积的方法，将半径 r 的值传入

    // 四舍五入格式化不换行输出球的面积，输出格式：球的表面积为xx


/********** End **********/

}
