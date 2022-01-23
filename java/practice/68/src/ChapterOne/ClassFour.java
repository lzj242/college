package ChapterOne;

/**
 * @Author 墨宣
 * @Date 2022/1/22 19:05
 * 目的：
 */

import java.util.Scanner;

public class ClassFour {
    public static void main(String[] args) {
        ClassFour classFour = new ClassFour();
        int nums;
        Scanner scanner = new Scanner(System.in);
        nums = scanner.nextInt();
        classFour.resolve(nums);
    }

    void resolve(int nums) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[nums];
        int[] score1 = new int[nums];
        int[] score2 = new int[nums];
        int[] score3 = new int[nums];
        float[] average = new float[nums];
        float[] score = new float[nums];
        for (int i = 0; i < nums; i++) {
            System.out.println("请输入学生编号:");
            number[i] = scanner.nextInt();
            System.out.println("请输入该学生的语文成绩:");
            score1[i] = scanner.nextInt();
            System.out.println("请输入该学生的数学成绩:");
            score2[i] = scanner.nextInt();
            System.out.println("请输入该学生的英语成绩:");
            score3[i] = scanner.nextInt();
            average[i] = (float) ((score1[i] + score2[i] + score3[i]) / 3.0);
            score[i] = score1[i] + score2[i] + score3[i];
            for (int j = 0; j < 40; j++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println("学生编号\t语文成绩\t数学成绩\t英语成绩\t平均成绩\t总成绩");
            for (int k = 0; k <= i; k++) {
                System.out.println(number[k] + "\t" + score1[k] + "\t" + score2[k] + "\t" + score3[k] + "\t" + average[k] + "\t" + score[k]);
            }
        }
    }
}
