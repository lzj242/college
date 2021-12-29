package PackAge;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author 墨宣
 * @Date 2021/12/22 19:04
 * 目的：
 */
import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        System.out.println(className.resolve(str1, str2));
    }

    public int resolve(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        } else if (str2.length() == 0 || str2 == null) {
            return 0;
        } else {
            char[] str = str2.toCharArray();
            for (char sr : str) {
                String sc = "" + sr;
                if (!str1.contains(sc)) {
                    return -1;
                }
            }
            int i=2;
            String str3=str1;
            StringBuffer stringBuffer = new StringBuffer(str1);
            while (true) {
                str3 = str3 + str1;
                if(i>=str2.length()+2*str1.length()){
                    return -1;
                }
                if (str3.contains(str2)) {
                    return i;
                }
                i++;
            }
        }
    }
}
