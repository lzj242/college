package ChapterTwelve;

/**
 * @Author 墨宣
 * @Date 2021/10/14 12:01
 * 目的：矩阵相乘
 */
public class ClassOne {
    public static void main(String[] args) {
        int[][] matrixa = {{5, 6, 7}, {15, 65, 43}, {32, 43, 22}, {11, 88, 6}, {4, 98, 66}};
        int[][] matrixb = {{94, 65, 31, 87, 21}, {48, 2, 0, 71, 98}, {38, 29, 66, 88, 100}};
        int[][] matrixc = new int[5][5];
        for (int i = 0; i < matrixa.length; i++) {
            for (int j = 0; j < matrixb[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrixb.length; k++) {
                    sum += matrixa[i][k] * matrixb[k][j];
                }
                matrixc[i][j] = sum;
            }

        }
        for (int i = 0; i < matrixa.length; i++) {
            for (int j = 0; j < matrixb[0].length; j++) {
                System.out.print(matrixc[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
