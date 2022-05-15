/**
 * @Author 墨宣
 * @Date 2022/5/12 19:51
 * @File : ClassOne
 * 目的：
 */

import java.util.*;
import java.util.stream.Collectors;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(classOne.resolve(numbers));
    }

    public int resolve(int[] numbers) {
        int result = numbers.length;
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for (int i = 1; i <= result; i++) {
            if (integerArray.indexOf(i)<0) {
                return i;
            }
        }
        return result + 1;
    }
}
