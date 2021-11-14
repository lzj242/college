package Chapter_Eleven;

/**
 * @Author 墨宣
 * @Date 2021/10/13 19:07
 * 目的：  /*
 * 任务：编写一个程序，由用户输入住房贷款和贷款年限，程序输出不同利率下的月还款额和总还款额，利率从 5%～8%，增长间隔为 1/8。
 * 例如，如果输入贷款额 10000 元人民币，贷款期限 5 年，程序应输出如下内容：
 * <p>
 * 贷款金额: 10000
 * 贷款年限: 5
 * 利率    月还款额    总还款额
 * 5.000%    188.71    11322.74
 * 5.125%    189.28    11357.13
 * ……
 * 8.000%    202.76    12165.83
 * <p>
 * 利率请保留3位小数，月还款额和总还款额请保留2位小数。
 * 利率和月还款额以及总还款额之间保留4个空格。
 * <p>
 * 思路：获取住房贷款以及贷款年限，计算不同利率下的月还款额以及总还款额。
 */

import java.util.Scanner;

public class ClassFive {

    // 请在Begin-End间编写完整代码，类名请使用LoanTest
    public static void main(String[] args) {
        double d;
        int n;
        char c='%';
        Scanner input = new Scanner(System.in);
        d = input.nextDouble();
         n= input.nextInt();
        System.out.println("贷款额：" +(int) d);
        System.out.println("贷款年限：" + n);
        double j = 0.05;
        double k;
        double l;
        double m;
        System.out.println("利率    月还款额    总还款额");
        for (int i = 0; i < 25; i++) {
            m = (d*1.0/(n*12.0)) * (1 + j);
            l = d + m;
            System.out.printf("%.3f%c%.2f%.2f\n", j * 100,c, m, l);
            j += 0.00125;
            d=l;
        }
/********** Begin **********/
// 导入 Scanner 类

// 定义公开类  LoanTest

        // 定义主方法 main，在该方法中完成本关任务


/********** End **********/

    }
}
//公式错了