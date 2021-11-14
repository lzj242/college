package a;
/*
任务：通过Scanner对象获取输入值n,求所有小于n的自然数的平均值。
输出的平均值请转化为double类型。
*/
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        double average;
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            sum += i;
        }
        average=sum/(n-1);
        System.out.printf("%.2f",average);
    }
}
