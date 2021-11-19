package a;
/*
任务：接收一个整数，判断该数是否是完数。
完数的定义：一个数如果恰好等于它的因子之和（本身除外），这个数就称为完数。
例如数字6，其因子为1，2，3，6（本身除外），满足1+2+3=6，所以这个数为完数。
如果是完数，请输出：x是完数
如果不是完数，请输出：x不是完数
具体输出样式见预期输出。
*/
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt(),sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+"是完数");
        }
        else{
            System.out.println(n+"不是完数");
        }
    }
}
