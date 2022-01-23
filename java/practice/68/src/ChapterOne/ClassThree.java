package ChapterOne;

/**
 * @Author 墨宣
 * @Date 2021/12/29 14:37
 * 目的：
 */

import java.util.Scanner;

public class ClassThree {
    int judge = 0;

    public static void main(String[] args) {
        System.out.println("欢迎来到双人五子棋大战");
        ClassThree classThree = new ClassThree();
        classThree.GameBackground_GoBang();
    }

    void GameBackground_GoBang() {
        int i = 0;
        String[][] background_GoBang = new String[11][11];
        for (int j = 0; j < background_GoBang.length; j++) {
            for (int k = 0; k < background_GoBang[j].length; k++) {
                background_GoBang[j][k] = "-";
            }
        }
        for (int j = 0; j < background_GoBang.length; j++) {
            for (int k = 0; k < background_GoBang[j].length; k++) {
                if (j == 0 && k == 0) {
                    background_GoBang[j][k] = " ";
                } else if (j == 0) {
                    background_GoBang[j][k] = String.valueOf(k - 1);
                } else if (k == 0) {
                    background_GoBang[j][k] = String.valueOf(j - 1);
                }
            }
        }
        Background_display(background_GoBang, false);
    }

    void Background_display(String[][] background_GoBang, boolean judge_1) {
        for (int i = 0; i < background_GoBang.length; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int j = 0; j < background_GoBang.length; j++) {
            for (int k = 0; k < background_GoBang[j].length; k++) {
                System.out.print(background_GoBang[j][k]);
                if (k == background_GoBang[j].length - 1) {
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < background_GoBang.length; i++) {
            System.out.print("-");
        }
        System.out.println();
        if (!judge_1) {
            GoBangPlay(background_GoBang, judge);
        } else {
            if (judge % 2 == 0) {
                System.out.println("游戏结束，玩家一获胜");
            } else {
                System.out.println("游戏结束，玩家二获胜");
            }
        }
    }

    void GoBangPlay(String[][] background_GoBang, int judge) {
        if (judge % 2 == 0) {
            System.out.println("请输入棋子(*)坐标:");
        } else {
            System.out.println("请输入棋子(o)坐标:");
        }
        judge++;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (judge % 2 == 0) {
            if (background_GoBang[x][y] != "o") {
                background_GoBang[x][y] = "*";
                Background_display(background_GoBang, GoBangJudge(x, y, background_GoBang));
            } else {
                System.out.println("请重新输入");
                GoBangPlay(background_GoBang, judge - 1);
            }
        }
    }

    boolean GoBangJudge(int x, int y, String[][] background_GoBang) {
        int max = 0;
        int tempXIndex = x;
        int tempYIndex = y;
        int count;
        boolean flag;
        // 三维数组记录横向，纵向，左斜，右斜的移动
        int[][][] dir = new int[][][]{
                // 横向
                {{-1, 0}, {1, 0}},
                // 竖着
                {{0, -1}, {0, 1}},
                // 左斜
                {{-1, -1}, {1, 1}},
                // 右斜
                {{1, -1}, {-1, 1}}};

        for (int i = 0; i < 4; i++) {
            count = 1;
            //j为0,1分别为棋子的两边方向，比如对于横向的时候，j=0,表示下棋位子的左边，j=1的时候表示右边
            for (int j = 0; j < 2; j++) {
                flag = true;
                /**
                 while语句中为一直向某一个方向遍历
                 有相同颜色的棋子的时候，Count++
                 否则置flag为false，结束该该方向的遍历
                 **/
                while (flag) {
                    tempXIndex = tempXIndex + dir[i][j][0];
                    tempYIndex = tempYIndex + dir[i][j][1];

                    //这里加上棋盘大小的判断，这里我设置的棋盘大小为20 具体可根据实际情况设置 防止越界
                    if (tempXIndex >= 0 && tempXIndex <= 10 && tempYIndex >= 0 && tempYIndex <= 10) {
                        if ((background_GoBang[tempXIndex][tempYIndex] == background_GoBang[x][y])) {
                            count++;
                        } else {
                            flag = false;
                        }
                    } else {
                        flag = false;
                    }

                }
                tempXIndex = x;
                tempYIndex = y;
            }

            if (count >= 5) {
                max = 1;
                break;
            } else {
                max = 0;
            }
        }
        if (max == 1)
            return true;
        else {
            return false;
        }
    }
}
