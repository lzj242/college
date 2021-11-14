package Chapter_Eight;

/**
 * @Author 墨宣
 * @Date 2021/10/22 20:01
 * 目的：
 */

import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //请在此添加实现代码
        /********** Begin **********/
            Thread t=new MyThread(num);
            t.start();

        /********** End **********/


    }
}


//请在此添加实现代码

/********** Begin **********/
class MyThread extends Thread {
    private  int n;
    MyThread(int n){
        this.n=n;
    }
    long a = 1;
    long b = 1;
    long temp;
    @Override
    public void run() {

        for(int i = 2; i < n; i++) {
            temp = a;
            a = b;
            b += temp;
        }
        System.out.println("子线程计算结果为："+b);
    }
}

/********** End **********/

