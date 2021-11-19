package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/21 17:40
 * 目的：熟练使用Thread方法来创建多线程
 */
import java.lang.Thread;
class Thread_one extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if (i%3==0){
                System.out.println("子线程一:"+i+"是3的倍数");
            }
        }
    }
}
class Thread_Two extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println("子线程二:"+i+"是2的倍数");
            }
        }
    }
}
public class ClassOne_Practice {
    public static void main(String[] args) {
        Thread t1=new Thread_one();
        Thread t2=new Thread_Two();
        t1.start();
        t2.start();
        for (int i=0;i<10;i++){
            if(i%2==0) {
                System.out.println("主线程:"+i+"是偶数");
            }
        }
    }
}
