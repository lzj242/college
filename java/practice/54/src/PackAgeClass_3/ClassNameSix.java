package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 19:16
 * 目的：理解break和continue的作用
 */
public class ClassNameSix {
    public static void main(String[] args) {
        int d = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            } else {
                System.out.println("快乐的洗碗");
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            } else {
                d++;
                System.out.println("已经洗了" + d + "天碗了");
            }
        }
        //注意事项
        //break:只能用于结束循环，或者结束switch
        //continue:只能在循环中使用
    }


}
