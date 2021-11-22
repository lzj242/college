package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/18 14:29
 * 目的：
 */

import jdk.internal.org.objectweb.asm.tree.ClassNode;

import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        String str1;
        Scanner scanner = new Scanner(System.in);
        str1 = scanner.nextLine();
        System.out.println(className.resolve(str1));
    }

    public int resolve(String str) {
        int maxlength = 1, length , x , y , j, k;
        int n = str.length();
        char[] c;
        char[] c1;
        String str2;
        if (n == 0 || str == null) {
            return 0;
        } else {
            c1=str.toCharArray();
            for (j = 0; j <=n; j++) {
                for (k = 0; k <= n; k++) {
                    if (k > j) {
                        int q=0;
                        if(k!=n&&j!=n){
                            if(c1[k]==c1[j]){
                                break;
                            }
                        }
                        str2 = str.substring(j, k);
                        c = str2.toCharArray();
                        for (x = 0; x < c.length; x++) {
                            for (y = 0; y < c.length; y++) {
                                if (x!=y&&c[x] == c[y]) {
                                    q++;
                                    break;
                                }
                            }
                        }
                        if (q==0) {
                            length = str2.length();
                            if (maxlength < length) {
                                maxlength = length;
                            }
                        }
                    }
                }
            }
            return maxlength;
        }
    }
}
