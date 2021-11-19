package a;
import java.util.Scanner;
/**
 * 任务：给出一个百分制成绩，输出与之对应的 GPA 成绩。
 */
// 第一步，判断变量 score 的值是否大于等于 90 并且小于等于 100，如果符合条件，则将 'A' 赋值给变量 grade

// 第二步，判断变量 score 的值是否大于等于 80 并且小于 90，如果符合条件，则将 'B' 赋值给变量 grade

// 第三步，判断变量 score 的值是否大于等于 70 并且小于 80，如果符合条件，则将 'C' 赋值给变量 grade

// 第四步，判断变量 score 的值是否大于等于 60 并且小于 70，如果符合条件，则将 'D' 赋值给变量 grade

// 第五步，如果以上条件都不满足，则将 'E' 赋值给变量 grade
public class b {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int grade;
        grade=reader.nextInt();
        if (grade>=90){
            System.out.println("该学生的成绩判断为：A");
        }
        else if (grade>=80&&grade<90){
            System.out.println("该学生的成绩判断为：B");
        }
        else if (grade>=70&&grade<80){
            System.out.println("该学生的成绩判断为：C");
        }
        else if(grade>=60&&grade<70){
            System.out.println("该学生的成绩判断为：D");
        }
        else{
            System.out.println("该学生的成绩判断为：E");
        }
    }
}
