package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/22 18:57
 * 目的：
 */
import java.util.Scanner;
public class ClassName {
    public static void main(String[] args) {
        ClassName className=new ClassName();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String []sr=s.split(",");
        System.out.println(className.resolve(sr));
    }
    public String resolve(String []sr){
        if(sr.length==0){
            return "";
        }
        else {
            String str=sr[0];
            for (String st:sr){
                while (!st.startsWith(str)){
                    if(st.length()==0){
                        return "";
                    }
                    else {
                        str= str.substring(0, str.length()-1);
                    }
                }
            }
            return str;
        }
    }
}
