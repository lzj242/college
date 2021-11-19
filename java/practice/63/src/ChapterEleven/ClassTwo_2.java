package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/21 18:11
 * 目的：实现Runnable接口(匿名内部类形式)来创建线程
 */
public class ClassTwo_2 {
    public static void main(String[] args) {
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程" + i);
                }   
            }
        };
        Thread t = new Thread(target);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程" + i);
        }
    }
}
