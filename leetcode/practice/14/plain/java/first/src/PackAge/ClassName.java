package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/22 14:46
 * 目的：
 */

import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] sr = str.split(",");
        System.out.println(className.resolve(sr));
    }

    public String resolve(String []sr) {
        int minlength = 201;
        for (String st : sr) {
            if (minlength > st.length()) {
                minlength = st.length();
            }
        }
        int n = sr.length;
        int j, k;
        StringBuffer result = new StringBuffer();
        for (j = 0; j < minlength; j++) {
            if (j == 0) {
                for (k = 0; k < n - 1; k++) {
                    if (sr[k].charAt(j) != sr[k + 1].charAt(j)) {
                        return "";
                    }
                }
                result.append(String.valueOf(sr[0].charAt(j)));
            } else {
                for (k = 0; k < n - 1; k++) {
                    if (sr[k].charAt(j) != sr[k + 1].charAt(j)) {
                        return result.toString();
                    }
                }
                result.append(String.valueOf(sr[0].charAt(j)));
            }
        }
        return result.toString();
    }
}
