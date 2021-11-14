package ChapterEleven;

/**
 * @Author 墨宣
 * @Date 2021/10/22 19:23
 * 目的：学会Thread常用API
 */
public class ClassFour {
    public static void main(String[] args) {
        Thread t1 = new MyThreadFour();
        t1.setName("1号");
        t1.start();
        System.out.println(t1.getName());
        Thread t2 = new MyThreadFour();
        t2.setName("2号");
        System.out.println(t2.getName());
        t2.start();
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程输出:" + i);
        }
    }
}

class MyThreadFour extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
    }
}
