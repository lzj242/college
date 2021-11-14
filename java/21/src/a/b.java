package a;
import java.util.Scanner;
import java.util.Arrays;

public class b {
    public static void main(String[] args) {
        int n,t=1;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        // 定义数组
        int []num=new int [n];
        // 给数组赋值
        for(int i=0;i<n;i++)
        {
            num[i]=input.nextInt();
        }
        // 使用直接选择排序法对数组升序排序，并输出每次排序的结果
        for (int i = 0; i < num.length - 1; i++) {
            int  min = i;
            // 找出第i个元素之后最小值的索引
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            // 交换最小值
            if (min != i) {
                int tmp = num[min];
                num[min] = num[i];
                num[i] = tmp;
            }
            System.out.print("第"+t+"次排序:[");
            for(int a=0;a<num.length;a++)
            {   if(a<num.length-1){
                System.out.print(num[a]+", ");
            }
            else{
                System.out.print(num[a]);
            }
            }
            System.out.println("]");
            t++;
        }
        // 输出排序后的数组
        System.out.print("排序后的结果为：[");
        for(int i=0;i<num.length;i++)
        {    if(i<num.length-1){
            System.out.print(num[i]+", ");
        }
        else{
            System.out.print(num[i]);
        }
        }
        System.out.print("]");
        /********** End **********/
    }
}