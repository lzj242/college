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
        int n = str.length();
        if (n == 0 || str == null) {
            return 0;
        } else {
            int maxlength=1;
            char[] c = str.toCharArray();
            int  t=0;
            StringBuffer sb = null;
            while (true) {
                sb = new StringBuffer(String.valueOf(c[t]));
                for (int i = t+1; i < n; i++) {
                    String str1 = String.valueOf(c[i]);
                    int b = sb.indexOf(str1);
                    if (b == -1) {
                        sb.append(str1);
                    } else {
                        break;
                    }
                }
                if(maxlength<sb.length()){
                    maxlength=sb.length();
                }
                if(t==n-1){
                    break;
                }
                else {
                    t++;
                }
            }
            return maxlength;
        }
    }
}
