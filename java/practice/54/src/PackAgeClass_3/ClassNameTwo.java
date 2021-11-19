package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 14:43
 * 目的：for循环
 */
public class ClassNameTwo {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 0; i < 3; i += n) {
            System.out.println("Hello World");
        }
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
                count++;
                System.out.println(i + "是水仙花数");
            }
        }
        System.out.println(count);
    }
}
