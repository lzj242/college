package a;
/*
任务：判断给定的任意一个大于 1 的正整数是否是素数。
素数的定义：在大于 1 的自然数中，除了 1 和它本身以外不再有其他因数的自然数。
思路：接收给定的正整数n，从2到n对该数取余，如果存在余数为零，那么该数不为素数，否则就是素数

如果不是：请输出“x不是一个素数”。
如果是：请输出“x是一个素数”。

*/
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int n=input.nextInt();
        for( i=2;i<n;i++){
            if(n%i==0) {
                System.out.println(n + "不是一个素数");
                break;
            }
        }
        if(i>=n){
            System.out.println(n+"是一个素数");
        }
    }
}
