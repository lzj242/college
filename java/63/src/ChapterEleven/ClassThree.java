package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/22 18:44
 * 目的：通过实现Callable接口来创建线程
 */

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 1.定义类实现Callable接口，重写call方法，封装要做的事
 * 2.用FutureTask把Callable对象封装成线程对象
 * 3.把线程任务对象交给Thread处理
 * 4.调用Thread的start方法启动线程，执行任务
 * 5.线程执行完毕后，通过FutureTask地get方法去获得任务执行的结果
 */
public class ClassThree {
    public static void main(String[] args) {
        /**
         * 3.创建Callable对象
         */
        Callable<String> call = new MyCallable(100);
        /**
         * 4.把Callable任务对象交给FuterTask对象
         */
        FutureTask<String> f1 = new FutureTask<>(call);
        Thread t1 = new Thread(f1);
        t1.start();
        try {
            String rs1 = f1.get();
            System.out.println("第一个结果" + rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 1.定义一个任务类
 */
class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * 2.重写call方法
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "子线程执行结果:" + sum;
    }
}
