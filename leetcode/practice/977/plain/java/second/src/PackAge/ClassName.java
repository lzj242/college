package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/1/26 18:19
 * 目的：
 */
import java.util.Scanner;
public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] example = new int[n];
        for (int i = 0; i < n; i++) {
            example[i] = scanner.nextInt();
        }
        className.resolve(example);
    }
    void resolve ( int[] example){
        for (int j=0;j<example.length;j++){
            example[j]*=example[j];
            for (int k=0;k<=j;k++){
                if()
            }
        }
    }
}
