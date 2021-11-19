package Chapter_Eleven;

/**
 * @Author 墨宣
 * @Date 2021/10/13 20:25
 * 目的：验证哥德巴赫猜想
 */
public class ClassSix {


    public static void main(String[] args) {

        int j;
        int k;
        int t;
        for (int i = 7; i < 100; i++) {
            for (j = 2; j < i; j++) {
                if (judge(j)) {
                    t = i - j;
                    if (judge(t)) {
                        System.out.println(i + "可分解为素数" + j + "和素数" + t);
                        break;
                    }
                }
            }
        }


    }

    public static boolean judge(int n) {
        int o = 0;
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                o = 0;
                break;
            }
        }
        if (i >= n) {
            o = 1;
        }
        if (o == 0) {
            return false;
        } else {
            return true;
        }

    }
}



