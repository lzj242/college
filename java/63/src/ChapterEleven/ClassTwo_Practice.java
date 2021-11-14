package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/21 18:23
 * 目的：熟练使用Runnable接口来创建多线程
 */
class myRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程1:" + i);
        }
    }
}
class Myrunnbale implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if(i%2==0){
                System.out.println("子线程2:"+i);
            }
        }
    }
}
public class ClassTwo_Practice {
    public static void main(String[] args) {
        Runnable runnable = new myRunnable();
        Runnable runnable1=new Myrunnbale();
        Thread t1=new Thread(runnable1);
        Thread t = new Thread(runnable);
        t1.start();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程:" + i);
        }
    }
}
