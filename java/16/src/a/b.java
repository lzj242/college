package a;
/**
 * 任务：判断学生的成绩是否合格（成绩分数不低于 60 ）
 */
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        int garde;
        Scanner reader=new Scanner(System.in);
        garde=reader.nextInt();
        if(garde>=60){
            System.out.println("该学生成绩判定为：合格" );
        }
        else{
            System.out.println("该学生成绩判定为：不合格");
        }
    }
}
