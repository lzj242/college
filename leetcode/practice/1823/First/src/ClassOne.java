/**
 * @Author 墨宣
 * @Date 2022/5/6 16:06
 * @File : ClassOne
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(classOne.resolve(n, k));
    }

    public int resolve(int n, int k) {
        String str = "";
        for (int i = 1; i <= n; i++) {
            str = str.concat(String.valueOf(i));
        }
        int t=0;
        while (true){
            if(str.length()==1){
                return Integer.parseInt(str);
            }
            char []chars=str.toCharArray();
            if(t+k<chars.length){
                chars[t+k-1]='0';
                t=t+k;
            }else {
                chars[t+k-1-chars.length]='0';
                t=t+k-1-chars.length;
            }
            str=null;
            for (int i=0;i<chars.length;i++){
                if(chars[i]!='0') {
                    str = str +String.valueOf(chars[i]);
                }
            }
        }
    }
}
