package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/10/10 13:52
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class ClassName {
    public static void main(String[] args) {

        /**
         * 使用 SimpleDateFormat 类格式化后输出 30 天后的时间信息。
         */
/**
 * 编写一个程序，计算小明的生日还有多少天
 *//**
         * 编写一个程序，计算小明的生日还有多少天
         */



                // 请在下面的Begin-End之间编写正确的代码
                /********** Begin **********/
                Scanner scanner = new Scanner(System.in);
                String birth = scanner.next();
                String today = scanner.next();
                SimpleDateFormat sft = new SimpleDateFormat("yyyy年MM月dd日");
                Date birthDate = null;
                Date todayDate = null;
                try {
                    birthDate = sft.parse(birth);
                    todayDate = sft.parse(today);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Calendar cToday = Calendar.getInstance();
                Calendar cBirth = Calendar.getInstance();
                cBirth.setTime(birthDate); // 设置生日
                cToday.setTime(todayDate); // 设置当前日期
                cBirth.set(Calendar.YEAR, cToday.get(Calendar.YEAR)); // 修改为本年格式
                int days;
                if (cBirth.get(Calendar.DAY_OF_YEAR) < cToday.get(Calendar.DAY_OF_YEAR)) {
                    // 生日已经过了，要算明年的了
                    days = cToday.getActualMaximum(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
                    cBirth.set(Calendar.YEAR, cToday.get(Calendar.YEAR)+1); // 修改为明年的生日日期
                    days += cBirth.get(Calendar.DAY_OF_YEAR);
                } else {
                    // 生日还没过
                    days = cBirth.get(Calendar.DAY_OF_YEAR) - cToday.get(Calendar.DAY_OF_YEAR);
                }
                // 输出结果
                if (days == 0) {
                    System.out.print("小明今天生日");
                } else {
                    System.out.print("距离生日还有" + days + "天");
                }
                /********** End **********/



    }
}
