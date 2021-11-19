package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 19:26
 * 目的：random随机数
 */

import java.util.Random;

public class ClassNameSeven {
    public static void main(String[] args) {
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            int d = r.nextInt(100);
            System.out.println(d - 10);
        }
        int date = r.nextInt(109876) - 3;
        System.out.println(date);
        //生成区间随机数:减加法
        int i = 0;
        while (i < 23 ){
            int example = r.nextInt(26) + 65;
            System.out.println(example);
            i++;
        }

    }
}
