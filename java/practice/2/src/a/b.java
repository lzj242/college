package a;

public class b {
    public static void main(String[] args) {

        double g = 9.8;     // 声明浮点型变量 g，用于表示重力加速度
        int v0 = 10;      // 声明整型变量 v0, 用于表示水平初速度
        int t = 3;      // 声明整型变量 t, 用于表示小球飞行的时间
        // 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码
        /********** Begin **********/
        // 第一步：计算水平距离，并赋值给s
        double s;
        s=v0*t;
        // 第二步：计算垂直距离，并赋值给h
        double h;
        h=0.5*g*t*t;
        // 第三步：计算小球与原点的距离，并赋值给d，Math.sqrt()表示的是对括号里的值求平方根
        double d;
        d=Math.sqrt(s*s+h*h);
        // 第四步：打印出小球与原点的距离d  输出格式：小球所在位置与抛出点之间的距离为 xxx 米。     其中 xxx 为求出的距离
        System.out.print("小球所在位置与抛出点之间的距离为 "+d);
        System.out.print("米");
        /********** End **********/

    }
}
