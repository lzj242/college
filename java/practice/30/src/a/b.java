package a;
/*
* 任务：使用for循环输出所有的水仙花数
*水仙花数特征：
  - 该值处于 100（包括）到 999（包括）之间；
  - 其个位数的三次幂，十位数的三次幂，百位数的三次幂的和等于这个数本身。
* 输出样式：x是一个水仙花数。
*/
import java.lang.Math;
public class b {
    public static void main(String[] args) {
        int ones,tens,hundreds;
        for(int i=999;i>=100;i--){
            ones=i%100%10;
            tens=i%100/10;
            hundreds=i/100;
            if(i==Math.pow(ones,3)+Math.pow(tens,3)+Math.pow(hundreds,3)) {
                System.out.println(i+"是一个水仙花数。");
            }

        }
    }
}
