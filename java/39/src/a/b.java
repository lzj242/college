package a;
import java.util.Arrays;
import java.util.Scanner;
public abstract class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] str1 =str.toCharArray();
        Arrays.sort(str1);
        String str2=String.valueOf(str1);
        System.out.println(str2);
    }
}
