package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/28 14:55
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(resolve(str));
    }

    static public int resolve(String str) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int judge = 0;
            judge = str.indexOf(c[i]);
            if (judge < i) {
                break;
            } else if (judge >= i) {
                if (judge == c.length - 1) {
                    return i;
                } else {
                    int t = str.indexOf(c[i], i + 1);
                    if (t == -1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
