package a;
import java.util.Scanner;
/**
 * @author HUAWEI
 */
public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0,x,sum=0;
        while(i<4){
            x=input.nextInt();
            if(x>0){
                sum+=x;
            }
            else{
                x=0;
                sum+=x;
            }
            i++;
        }
        System.out.println(sum);
    }
}
