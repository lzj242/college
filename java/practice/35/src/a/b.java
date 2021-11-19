package a;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name1 = input.next();
        String name2 = input.next();
        String name3;
        name3=name2.concat(name1);
        System.out.println(name3);
    }
}
