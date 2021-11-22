package packAge;

/**
 * @Author 墨宣
 * @Date 2021/11/22 11:26
 * 目的：
 */

import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(className.resolve(str));
    }

    public int resolve(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        } else if (str.length() == 1 && (str.contains("-") || str.contains("+"))) {
            return 0;
        } else {
            double result = 0;
            int t = 0;
            char[] d = new char[str.length()];
            char[] c = str.toCharArray();
            if (c[0] == '-') {
                t = 0;
                if (c[1] >= '0' && c[1] <= '9') {
                    for (int i = 1; i < c.length; i++) {
                        if (c[i] >= '0' && c[i] <= '9') {
                            d[t] = c[i];
                            t++;
                        } else {
                            break;
                        }
                    }
                    String str1 = new String(d);
                    result = -1 * Double.valueOf(str1.trim());
                    if (result < -2147483648) {
                        result = -2147483648;
                    }
                    return (int) result;
                } else {
                    return 0;
                }
            } else if (c[0] == '+') {
                if (c[1] >= '0' && c[1] <= '9') {
                    for (int i = 1; i < c.length; i++) {
                        if (c[i] >= '0' && c[i] <= '9') {
                            d[t] = c[i];
                            t++;
                        } else {
                            break;
                        }
                    }
                    String str1 = new String(d);
                    result = Double.valueOf(str1.trim());
                    if (result > 2147483647) {
                        result = 2147483647;
                    }
                    return (int) result;
                } else {
                    return 0;
                }
            } else {
                if (c[0] >= '0' && c[0] <= '9') {
                    for (int i = 0; i < c.length; i++) {
                        if (c[i] >= '0' && c[i] <= '9') {
                            d[t] = c[i];
                            t++;
                        } else {
                            break;
                        }
                    }
                    String str1 = new String(d);
                    result = Double.valueOf(str1.trim());
                    if (result > 2147483647) {
                        result = 2147483647;
                    }
                    return (int) result;
                } else {
                    return 0;
                }
            }
        }
    }
}