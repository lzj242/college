package a;
/**
 * 任务：输入两个整数，判断其是否同为偶数。
 */
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int a,b;
        a=reader.nextInt();
        b=reader.nextInt();
        if(a%2==0&&b%2==0){
            System.out.println("两个数同为偶数！");
        }
        else{
            System.out.println("两个数至少有一个数为奇数！");
        }
    }
}
