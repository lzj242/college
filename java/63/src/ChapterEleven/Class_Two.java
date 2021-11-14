package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/21 17:51
 * 目的：实现Runnable接口来创建线程
 */

/**
 * 1.创建一个类来实现Runnable接口
 */
class MyRunnable implements Runnable {
    /**
     * 2.重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程：" + i);
        }
    }
}

public class Class_Two {
    public static void main(String[] args) {
        /**
         * 3.创建一个任务对象
         */
        Runnable runnable = new MyRunnable();
        /**
         *4.把任务对象交给Thread处理
         */
        Thread t = new Thread(runnable);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程:" + i);
        }
    }
}
