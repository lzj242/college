package PackAgeName;

/**
 * @Author 墨宣
 * @Date 2021/10/9 16:19
 */
/**
 * 计算两个日期之间的间隔时间
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.Duration;
import java.text.DateFormat;
import java.util.SplittableRandom;

public class ClassName {

//    ***** End **********/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String d1 = scanner.next();
        String d2 = scanner.next();
        SimpleDateFormat sft = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date aDate = null;
        Date bDate = null;
        try {
            aDate = sft.parse(d1);
            bDate = sft.parse(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("距离上一个时间过去了多久：" + getTime(aDate, bDate));

    }
    public static String getTime(Date d1,Date d2) {
        // 请在下面的Begin-End之间编写正确的代码
        /********** Begin **********/
        long l=Math.abs(d1.getTime()-d2.getTime());

        String str=" ";
        if(l>=0&&l<=60000) {
            str= "刚刚";
        }
       else  if(l>60000&&l<=3600000) {

            str= l / 60000+ "分钟前";
        }
       else  if (l>3600000&&l<=86400000)
         {
             str=l/60000/60+"小时前";
         }
     else   if(l>86400000){

            str=(l / 1000 / 60 / 60 / 24 + "天前");
        }
        return  str;
    }
}