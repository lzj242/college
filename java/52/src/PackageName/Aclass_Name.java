package PackageName;

/**
 * @Author 墨宣
 * @Date 2021/10/10 15:33
 */

    import java.util.Scanner;
    import java.util.regex.*;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
public class Aclass_Name {
    public static void main(String[] args) {
// 请在Begin-End间编写代码
/********** Begin **********/

        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
// 分割字符串
        String[] split = str.split("@");
// 判断给定字符串中的数字是否属于手机号码，是的话请输出：“X是手机号码”
        String regStr = "^((13[0-9])|(15[4])|(18[0-9])|(17[0-9])|(147))\\d{8}$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(str);


        boolean s1 = matcher.find();
        if (split[0].length() == 11 && s1) {
            System.out.print(split[0] + "是手机号码");
        } else {
            System.out.print(split[0] + "不是手机号码");
        }
    }
    }