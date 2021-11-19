package ChapterThirteen;

/**
 * @Author 墨宣
 * @Date 2021/11/1 14:15
 * 目的：
 */
public class ClassSeven {
        public static void main(String[] args) throws Exception {
            /********* Begin *********/
            //在这里创建线程， 开启线程




            /********* End *********/
        }
    }

    class MyThread extends Thread {
        /********* Begin *********/


        String threadName;


        public void run() {

            int count = 5;

            while(count > 0){

                System.out.println("Java Thread" + this.threadName);
                count--;
            }
        }

        /********* End *********/
    }

