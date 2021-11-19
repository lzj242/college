package PackAge_2;

/**
 * @Author 墨宣
 * @Date 2021/10/11 20:15
 * 目的：逻辑运算符
 */
public class ClassNameSeven {
    public static void main(String[] args) {
        double size=9.8;
        double storage=6;
        System.out.println(size>6.95&&storage>=9);
        System.out.println(size>6.95||storage>=9);
        //异或
        System.out.println(false^true);
        System.out.println(false^false);
        // 单与和单或两边都要判断
        int a=10;
        int b=20;
        System.out.println(a>100&&++b>10);
        System.out.println(b);
        System.out.println(a>100&++b>10);
        System.out.println(b);
    }
}
