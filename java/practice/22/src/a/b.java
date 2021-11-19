package a;
import java.util.Scanner;

/**
 * 任务：根据给定的年份和月份，获取该月份的天数。
 * @author HUAWEI
 */
public class b {

    /**
     * 请在下面的 Begin - End 之间按照注释中给出的提示编写正确的代码。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day;
        //********** Begin **********/
        // 第一步：判断变量 month 是否为 1、3、5、7、8、10、12 内的月份，如果是，则将数值 31 赋值给变量 day
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            day=31;
        }

        // 第二步：判断变量 month 是否为 4、6、9、11 内的月份，如果是，则将数值 30 赋值给 day
        else if(month==4||month==6||month==9||month==11){
            day=30;
        }

        // 第三步：如果以上条件都不满足，则进入最后一种情况
        else{
            if(year%4==0){
                day=29;
            }
            else{
                day=28;
            }
        }

        // 第四步：判断是否是闰年，是闰年，则将数值 29 赋值给 day；反之，则将数值 28 赋值给 day


        /********** End **********/
        System.out.print(year + "年" + month + "月有" + day + "天");
    }
}
