package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/1/26 17:54
 * 目的：
 */


import java.util.Arrays;
import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] example = new int[n];
        for (int i = 0; i < n; i++) {
            example[i] = scanner.nextInt();
        }
        className.resolve(example);
    }

    void resolve(int[] example) {
        for (int i = 0; i < example.length; i++) {
            example[i] = example[i] * example[i];
        }
        Arrays.sort(example);
        for (int i = 0; i < example.length; i++) {
            System.out.printf("%d\t", example[i]);
        }
    }
}
