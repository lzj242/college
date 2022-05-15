/**
 * @Author 墨宣
 * @Date 2022/5/2 20:51
 * @File : ClassOne
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        System.out.println(classOne.resolve(s, k));
    }

    public Boolean resolve(String s, int k) {
        if(s.length()<(Math.pow(2,k)+(k-1))){
            return false;
        }
        for (int i = 0; i < (Math.pow(2, k)); i++) {
            String str = Integer.toBinaryString(i);
            while (str.length()<k){
                str="0"+str;
            }
            if (!s.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
