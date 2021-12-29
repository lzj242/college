package ChapterOne;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @Author 墨宣
 * @Date 2021/12/26 11:18
 * 目的：
 */
public class test {
    public static void main(String[] args) {
        char[][] gameBackground1 = new char[10][50];
        char t = gameBackground1[4][48] = '*';
        char p = gameBackground1[4][47] = 'e';
        int j = 0,i,k;
        int j1 = 0, j2 = 0, j3 = 0, k1 = 0, k2 = 0, k3 = 0;
        for ( j = 0; j < gameBackground1.length; j++) {
            int k1_ = Arrays.binarySearch(gameBackground1[j], '*');
            int k2_ = Arrays.binarySearch(gameBackground1[j], 'e');
            int k3_ = Arrays.binarySearch(gameBackground1[j], 'o');
            if (k1_ >= 0) {
                j1 = j;
                k1 = k1_;
            }

            if (k2_ >= 0) {
                j2 = j;
                k2 = k2_;
            }



        }

        System.out.println(j1);
        System.out.println(k1);
        System.out.println(j2);
        System.out.println(k2);
    }
}
