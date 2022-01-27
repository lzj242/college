package PackaheName;

/**
 * @Author 墨宣
 * @Date 2022/1/26 17:38
 * 目的：
 */
import java.util.Scanner;
public class ClassName {
    public static void main(String[] args) {
        ClassName className=new ClassName();
        Scanner scanner=new Scanner(System.in);
        String str;
        str=scanner.nextLine();
        System.out.println(className.resolve(str));
    }
    int resolve(String str){
        char []word=str.toCharArray();
        int t=0;
        for (int i=word.length-1;i>=0;i--){
            if(word[i]!=' '){
                t++;
                if(word[i-1]==' '&&i-1>=0){
                    return t;
                }
            }
        }
        return t;
    }
}
