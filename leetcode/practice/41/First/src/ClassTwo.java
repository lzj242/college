import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
/**
 * @Author 墨宣
 * @Date 2022/5/13 18:26
 * @File : ClassTwo
 * 目的：
 */
public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(classTwo.resolve(numbers));
    }

    public int resolve(int[] numbers) {
        int result = numbers.length;
        Arrays.sort(numbers);
        HashSet<Integer> nums = new HashSet<Integer>();
        int t=1;
        for (int i = 1; i <= result; i++) {
            if(numbers[i] >0){
                int size=nums.size();
                nums.add(numbers[i]);
                if(size<nums.size()){
                    if(t!=numbers[i]){
                        return t;
                    }else{
                        t++;
                    }
                }
            }
        }
        return t;
    }
}



