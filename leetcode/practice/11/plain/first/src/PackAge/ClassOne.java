package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/12 17:28
 * 目的：
 */
import java.util.Scanner;
public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne=new ClassOne();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        System.out.println(classOne.resolve(nums));
    }
    public int resolve(int []height){
        int result=0;
        for (int j=1;j<height.length;j++){
            for (int k=0;k<j;k++){
                result=Math.max(result,(j-k)*(Math.min(height[j],height[k])));
            }
        }
        return result;
    }
}
