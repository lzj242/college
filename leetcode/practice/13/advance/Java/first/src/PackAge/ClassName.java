package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/14 20:48
 * 目的：
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.println(className.resolve(s));
    }

    Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int resolve(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int value = map.get(s.charAt(i));
            if (i < n - 1 && value < map.get(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;
    }
}