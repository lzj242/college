package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/9 12:17
 * 目的：
 */

import sun.font.CreatedFontTracker;

import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        boolean b = className.resolve(num);
        System.out.println(b);
    }

    public boolean resolve(int x) {
        if (x < 0) {
            return false;
        } else {
            String str = x + "";
            if (str.length() % 2 == 0) {
                String sr1 = str.substring(0, (str.length() / 2));
                String sr2 = str.substring((str.length() / 2), str.length());
                /**
                 * 提取字串（相当于切割）
                 */
                String reverse = new StringBuffer(sr1).reverse().toString();
                if (reverse.equals(sr2)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                String sr1 = str.substring(0, (str.length() / 2));
                String sr2 = str.substring((str.length() / 2 + 1), str.length());
                String reverse = new StringBuffer(sr1).reverse().toString();
                /**反转字符串
                 */
                if (reverse.equals(sr2)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
