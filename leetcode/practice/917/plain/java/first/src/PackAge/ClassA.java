package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/23 11:46
 * 目的：
 */

import java.util.Scanner;

public class ClassA {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(classA.resolve(str));
    }

    public String resolve(String str) {
        String result = null;
        char[] st = str.toCharArray();
        for (int i = 0; i < st.length / 2; i++) {
            if (Character.isLowerCase(st[i]) || Character.isUpperCase(st[i])) {
                if (Character.isLowerCase(st[st.length - i - 1] )|| Character.isUpperCase(st[st.length - i - 1])){
                    char t;
                    t=st[i];
                    st[i]=st[st.length-i-1];
                    st[st.length-i-1]=t;
                }
            }
        }
        return result=String.copyValueOf(st);
    }
}
