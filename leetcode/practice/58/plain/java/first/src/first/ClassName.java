package first;

/**
 * @Author 墨宣
 * @Date 2022/1/26 17:25
 * 目的：
 */
import java.util.Scanner;
public class ClassName {
    public static void main(String[] args) {
        ClassName className=new ClassName();
        String str;
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        System.out.println(className.resolve(str));
    }
    public int resolve(String str){
        String []strings;
        strings=str.split(" ");
        return strings[strings.length-1].trim().length();
    }
}
