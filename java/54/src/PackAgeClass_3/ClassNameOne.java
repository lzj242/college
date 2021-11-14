package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 14:02
 * 目的：分支结构
 */

import java.util.Scanner;

public class ClassNameOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        //if分支
        if (n < 60 || n > 100) {
            System.out.println("你需要进一步检查");
        } else {
            System.out.println("正常");
        }
        //switch分支
        String str;
        str = input.next();
        switch (str) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛帮忙");
                break;
            case "周三":
                System.out.println("小龙虾");
                break;
            case "周四":
                System.out.println("帮别的程序员改bug");
                break;
            default:
                System.out.println("没了");
                break;
        }
        //switch注意事项
        //1.表达式类型不支持double(不精确),float,long;
        //2.case的值不能重复；
        //break不能忘记，否则会出现穿透现象
        int m;
        m = input.nextInt();
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
                System.out.println(m + "月是31天");
                break;
            case 2:
                System.out.println(m+"月是29或28天");
                 break;
            case 4:
            case 6:
            case 9:
            case 12:
                System.out.println(m+"月是30天");
                break;
        }


    }
}
