package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/22 14:30
 * 目的：熟练使用Runnable接口(匿名内部类）
 */
public class Class_TwoPractice {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程" + i);
                }
            }
        };
        Thread t=new Thread(runnable);
        t.start();
        for (int i=0;i<10;i++) {
            System.out.println("主线程"+i);
        }
    }
}
