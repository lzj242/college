package a;
/**
 * 任务：按升序（从小到大）输出三个数
 */
/**
 * @author Fen
 */
import java.util.Scanner;

public class compareSize {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int a, b, c, max, min,med;
    a = reader.nextInt();
    b = reader.nextInt();
    c = reader.nextInt();
    max=a;
    med=b;
    min=c;
    if (a>=b&&b>=c){
      max=a;
      med=b;
      min=c;
    }
    else if(a>=c&&c>=b){
      max=a;
      med=c;
      min=b;
    }
    else if (b>=a&&a>=c){
      max=b;
      med=a;
      min=c;
    }
    else if (b>=c&&c>=a){
      max=b;
      med=c;
      min=a;
    }
    else if (c>=a&&a>=b){
      max=c;
      med=a;
      min=b;
    }
    else if (c>=b&&b>=a){
      max=c;
      med=b;
      min=a;
    }
    System.out.println("从小到大排列:" + min + " " + med + " " + max);
  }
}
