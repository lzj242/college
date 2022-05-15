import java.util.Scanner;

/**
 * @Author 墨宣
 * @Date 2022/4/27 21:24
 * @File : ClassTwo
 * 目的：
 */
public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(classTwo.resolve(x));
    }

    int resolve(int x) {
        if (x == 1) {
            return 1;
        }
        int max = x;
        int min = 0;
        while (max - min > 1) {
            int m = (max + min) / 2;
            if (x / m < m) {
                max = m;
            } else {
                min = m;
            }
        }
        return min;
    }
}
