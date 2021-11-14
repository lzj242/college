package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/21 16:34
 * 目的：创建多线程
 */

import java.lang.Thread;//Thread类是线程类

public class ClassOne {
    public static void main(String[] args) {
        //方法一:
        //1).定义一个子类继承Thread,重写run()方法
        //2).创建该子类的对象
        //3).调用该对象的start()方法
        /**
         * 3.new一个新线程对象
         */
        Thread t = new MyThread();
        /**
         * 4.调用start方法
         */
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("**主线程**"+i);
        }
    }

}//1。定义一个线程继承Thread

class MyThread extends Thread {
    @Override
    /**2.重写run方法*/
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("**子线程**" + i);
        }

    }
}
