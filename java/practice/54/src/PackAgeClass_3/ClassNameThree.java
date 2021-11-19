package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 15:03
 * 目的：while循环
 */
public class ClassNameThree {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("Hello World");
            i++;
        }
        int length = 8848860;
        double d = 0.1;
        int count = 0;
        while (d < length) {
            d *= 2;
            count++;
        }
        System.out.println(d);
        System.out.println(count);
        //do-while:先执行一次
        i = 0;
        do {
            i++;
            System.out.println("Hello Java");
        } while (i < 0);

    }
}
