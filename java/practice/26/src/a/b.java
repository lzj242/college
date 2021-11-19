package a;
import java.util.Scanner;
public class b{
    public static void main(String[] args) {
        double sum = 0.0;
        int z = 0;
        int   c;

        Scanner input = new Scanner(System.in);
        while(true) {
            c = input.nextInt();
            if (c == (int)'%') {
                break;
            } else {
                sum += c;
                z++;
            }
        }

        double  x = (sum/z);
        System.out.printf("%.2f",x);

    }
}
