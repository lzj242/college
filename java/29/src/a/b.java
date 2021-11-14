package a;
/*
任务：统计给定一列数的正数和负数个数
给定的数举例：-1 2 3 -4 %
其中%用于while中，判断输入结束
*/
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int positiveinteger=0,negativeinteger=0;
        int n;
        while(!input.hasNext("%")){
            n=input.nextInt();
            if(n>=0){
                positiveinteger++;
            }
            else {
                negativeinteger++;
            }
        }
        System.out.println("正数个数为："+positiveinteger+"。负数个数为："+negativeinteger);
    }
}
