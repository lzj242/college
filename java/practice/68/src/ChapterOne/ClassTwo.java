package ChapterOne;

/**
 * @Author 墨宣
 * @Date 2021/12/25 19:05
 * 目的：
 */

import java.util.Arrays;
import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        classTwo.main_interface();
    }

    void main_interface() {
        int choice1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到推箱子小游戏");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
            if (i == 14) {
                System.out.println();
            }
        }
        System.out.println("请选择");
        System.out.println("1:开始游戏");
        System.out.println("2:获取帮助");
        System.out.println("3:退出游戏");
        choice1 = scanner.nextInt();
        GameChoice1(choice1);
    }

    void GameChoice1(int choice1) {
        Scanner scanner = new Scanner(System.in);
        switch (choice1) {
            case 1:
                GameChoice2();
                break;
            case 2:
                System.out.println("很简单的啦，用人(o)把箱子(&)放到目的地(*)");
                System.out.println("按1返回");
                int p = scanner.nextInt();
                if (p == 1) {
                    main_interface();
                }
                break;
            case 3:
                System.out.println("再见");
                break;
            default:
                System.out.println("您的选择错误，请重新选择");
                main_interface();
                break;
        }
    }

    void GameChoice2() {
        Scanner scanner = new Scanner(System.in);
        int choice2;
        System.out.println("请选择关卡");
        System.out.println("1:第一关");
        System.out.println("2:第二关");
        System.out.println("3:第三关");
        System.out.println("4:退出游戏");
        choice2 = scanner.nextInt();
        switch (choice2) {
            case 1:
                GameFirstPass();
                break;
            case 2:
                GameSecondPass();
                break;
            case 3:
                GameThirdPass();
                break;
            case 4:
                System.out.println("再见");
                break;
            default:
                System.out.println("您的选择错误，请重新选择");
                GameChoice2();
        }

    }

    void GameFirstPass() {
        Scanner scanner = new Scanner(System.in);
        char[][] gameBackground1 = new char[10][50];
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 50; k++) {
                if (j == 0 || k == 0 || j == 9 || k == 49) {
                    gameBackground1[j][k] = 'H';
                } else if ((j == 3 || j == 5) && (k >= 30)) {
                    gameBackground1[j][k] = 'H';
                } else if (k == 20 && j <= 3) {
                    gameBackground1[j][k] = 'H';
                } else if (k == 25 && j >= 5) {
                    gameBackground1[j][k] = 'H';
                } else {
                    gameBackground1[j][k] = ' ';
                }
            }
        }
        gameBackground1[4][48] = '*';
        gameBackground1[6][17] = '&';
        gameBackground1[8][6] = 'o';
        resolve(gameBackground1);
    }


    void GameSecondPass() {
        char[][] gameBackground2 = new char[10][50];
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 50; k++) {
                if (j == 0 || k == 0 || j == 9 || k == 49) {
                    gameBackground2[j][k] = 'H';
                } else {
                    gameBackground2[j][k] = ' ';
                }
            }
        }
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 50; k++) {
                System.out.print(gameBackground2[j][k]);
                if (k == 49) {
                    System.out.println();
                }
            }
        }
    }

    void GameThirdPass() {
        char[][] gameBackground3 = new char[10][50];
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 50; k++) {
                if (j == 0 || k == 0 || j == 9 || k == 49) {
                    gameBackground3[j][k] = 'H';
                } else {
                    gameBackground3[j][k] = ' ';
                }
            }
        }
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 50; k++) {
                System.out.print(gameBackground3[j][k]);
                if (k == 49) {
                    System.out.println();
                }
            }
        }
    }

    void resolve(char[][] GameBackground) {
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < GameBackground.length; j++) {
            for (int k = 0; k < GameBackground[0].length; k++) {
                System.out.print(GameBackground[j][k]);
                if (k == GameBackground[0].length - 1) {
                    System.out.println();
                }
            }
        }
        int j1 = 0, j2 = 0, j3 = 0, k1 = 0, k2 = 0, k3 = 0;
        for (int j = 0; j < GameBackground.length; j++) {
            int k1_ = Arrays.binarySearch(GameBackground[j], '*');


            if (k1_ >= 0) {
                j1 = j;
                k1 = k1_;
            }
            for (int k = 0; k < GameBackground[j].length; k++) {
                if (GameBackground[j][k] == '&') {
                    j2 = j;
                    k2 = k;
                }
            }
            for (int k = 0; k < GameBackground[j].length; k++) {
                if (GameBackground[j][k] == 'o') {
                    j3 = j;
                    k3 = k;
                }
            }
        }
        while (true) {
            char key = scanner.next().charAt(0);
            if (key == 'w' || key == 'W') {
                if (GameBackground[j3 - 1][k3] != '*') {
                    if (GameBackground[j3 - 1][k3] != 'H' && GameBackground[j3 - 1][k3] != '&') {
                        char c;
                        c = GameBackground[j3][k3];
                        GameBackground[j3][k3] = GameBackground[j3 - 1][k3];
                        GameBackground[j3 - 1][k3] = c;
                        j3 = j3 - 1;
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3 - 1][k3] == 'H') {
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3 - 1][k3] == '&') {
                        if (GameBackground[j3 - 3][k3] != '*') {
                            if (GameBackground[j3 - 2][k3] != 'H') {
                                char c;
                                c = GameBackground[j3 - 2][k3];
                                GameBackground[j3 - 2][k3] = GameBackground[j3 - 1][k3];
                                GameBackground[j3 - 1][k3] = c;
                                c = GameBackground[j3 - 1][k3];
                                GameBackground[j3 - 1][k3] = GameBackground[j3][k3];
                                GameBackground[j3][k3] = c;
                                j3 = j3 - 1;
                                for (int j = 0; j < GameBackground.length; j++) {
                                    for (int k = 0; k < GameBackground[0].length; k++) {
                                        System.out.print(GameBackground[j][k]);
                                        if (k == GameBackground[0].length - 1) {
                                            System.out.println();
                                        }
                                    }
                                }
                            } else {
                                char c;
                                c = GameBackground[j3 - 2][k3];
                                GameBackground[j3 - 2][k3] = GameBackground[j3 - 1][k3];
                                GameBackground[j3 - 1][k3] = GameBackground[j3][k3];
                                GameBackground[j3][k3] = ' ';
                                for (int j = 0; j < GameBackground.length; j++) {
                                    for (int k = 0; k < GameBackground[0].length; k++) {
                                        System.out.print(GameBackground[j][k]);
                                        if (k == GameBackground[0].length - 1) {
                                            System.out.println();
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                } else {
                    for (int j = 0; j < GameBackground.length; j++) {
                        for (int k = 0; k < GameBackground[0].length; k++) {
                            System.out.print(GameBackground[j][k]);
                            if (k == GameBackground[0].length - 1) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
            if (key == 'a' || key == 'A') {
                if (GameBackground[j3][k3 - 1] != '*') {
                    if (GameBackground[j3][k3 - 1] != 'H' && GameBackground[j3][k3 - 1] != '&') {
                        char c;
                        c = GameBackground[j3][k3];
                        GameBackground[j3][k3] = GameBackground[j3][k3 - 1];
                        GameBackground[j3][k3 - 1] = c;
                        k3 = k3 - 1;
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3][k3 - 1] == 'H') {
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3][k3 - 1] == '&') {
                        if (GameBackground[j3][k3 - 3] != '*') {
                            if (GameBackground[j3][k3 - 2] != 'H') {
                                char c;
                                c = GameBackground[j3][k3 - 2];
                                GameBackground[j3][k3 - 2] = GameBackground[j3][k3 - 1];
                                GameBackground[j3][k3 - 1] = c;
                                c = GameBackground[j3][k3 - 1];
                                GameBackground[j3][k3 - 1] = GameBackground[j3][k3];
                                GameBackground[j3][k3] = c;
                                k3 = k3 - 1;
                                for (int j = 0; j < GameBackground.length; j++) {
                                    for (int k = 0; k < GameBackground[0].length; k++) {
                                        System.out.print(GameBackground[j][k]);
                                        if (k == GameBackground[0].length - 1) {
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        } else {
                            char c;
                            c = GameBackground[j3][k3 - 2];
                            GameBackground[j3][k3 - 2] = GameBackground[j3][k3 - 1];
                            GameBackground[j3][k3 - 1] = GameBackground[j3][k3];
                            GameBackground[j3][k3] = ' ';
                            for (int j = 0; j < GameBackground.length; j++) {
                                for (int k = 0; k < GameBackground[0].length; k++) {
                                    System.out.print(GameBackground[j][k]);
                                    if (k == GameBackground[0].length - 1) {
                                        System.out.println();
                                    }
                                }
                            }
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < GameBackground.length; j++) {
                        for (int k = 0; k < GameBackground[0].length; k++) {
                            System.out.print(GameBackground[j][k]);
                            if (k == GameBackground[0].length - 1) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
            if (key == 's' || key == 'S') {
                if (GameBackground[j3 + 1][k3] != '*') {
                    if (GameBackground[j3 + 1][k3] != 'H' && GameBackground[j3 + 1][k3] != '&') {
                        char c;
                        c = GameBackground[j3][k3];
                        GameBackground[j3][k3] = GameBackground[j3 + 1][k3];
                        GameBackground[j3 + 1][k3] = c;
                        j3 = j3 + 1;
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3 + 1][k3] == 'H') {
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3 + 1][k3] == '&') {
                        if (GameBackground[j3 + 3][k3] != '*') {
                            if (GameBackground[j3 + 2][k3] != 'H') {
                                char c;
                                c = GameBackground[j3 + 2][k3];
                                GameBackground[j3 + 2][k3] = GameBackground[j3 + 1][k3];
                                GameBackground[j3 + 1][k3] = c;
                                c = GameBackground[j3 + 1][k3];
                                GameBackground[j3 + 1][k3] = GameBackground[j3][k3];
                                GameBackground[j3][k3] = c;
                                j3 = j3 + 1;
                                for (int j = 0; j < GameBackground.length; j++) {
                                    for (int k = 0; k < GameBackground[0].length; k++) {
                                        System.out.print(GameBackground[j][k]);
                                        if (k == GameBackground[0].length - 1) {
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        } else {
                            char c;
                            c = GameBackground[j3 + 2][k3];
                            GameBackground[j3 + 2][k3] = GameBackground[j3 + 1][k3];
                            GameBackground[j3 + 1][k3] = GameBackground[j3][k3];
                            GameBackground[j3][k3] = ' ';
                            for (int j = 0; j < GameBackground.length; j++) {
                                for (int k = 0; k < GameBackground[0].length; k++) {
                                    System.out.print(GameBackground[j][k]);
                                    if (k == GameBackground[0].length - 1) {
                                        System.out.println();
                                    }
                                }
                            }
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < GameBackground.length; j++) {
                        for (int k = 0; k < GameBackground[0].length; k++) {
                            System.out.print(GameBackground[j][k]);
                            if (k == GameBackground[0].length - 1) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
            if (key == 'd' || key == 'D') {
                if (GameBackground[j3][k3 + 1] != '*') {
                    if (GameBackground[j3][k3 + 1] != 'H' && GameBackground[j3][k3 + 1] != '&') {
                        char c;
                        c = GameBackground[j3][k3];
                        GameBackground[j3][k3] = GameBackground[j3][k3 + 1];
                        GameBackground[j3][k3 + 1] = c;
                        k3 = k3 + 1;
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3][k3 + 1] == 'H') {
                        for (int j = 0; j < GameBackground.length; j++) {
                            for (int k = 0; k < GameBackground[0].length; k++) {
                                System.out.print(GameBackground[j][k]);
                                if (k == GameBackground[0].length - 1) {
                                    System.out.println();
                                }
                            }
                        }
                    } else if (GameBackground[j3][k3 + 1] == '&') {
                        if (GameBackground[j3][k3 + 2] != '*') {
                            if (GameBackground[j3][k3 + 2] != 'H') {
                                char c;
                                c = GameBackground[j3][k3 + 2];
                                GameBackground[j3][k3 + 2] = GameBackground[j3][k3 + 1];
                                GameBackground[j3][k3 + 1] = c;
                                c = GameBackground[j3][k3 + 1];
                                GameBackground[j3][k3 + 1] = GameBackground[j3][k3];
                                GameBackground[j3][k3] = c;
                                k3 = k3 + 1;
                                for (int j = 0; j < GameBackground.length; j++) {
                                    for (int k = 0; k < GameBackground[0].length; k++) {
                                        System.out.print(GameBackground[j][k]);
                                        if (k == GameBackground[0].length - 1) {
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        } else {
                            char c;
                            c = GameBackground[j3][k3 + 2];
                            GameBackground[j3][k3 + 2] = GameBackground[j3][k3 + 1];
                            GameBackground[j3][k3 + 1] = GameBackground[j3][k3];
                            GameBackground[j3][k3] = ' ';
                            for (int j = 0; j < GameBackground.length; j++) {
                                for (int k = 0; k < GameBackground[0].length; k++) {
                                    System.out.print(GameBackground[j][k]);
                                    if (k == GameBackground[0].length - 1) {
                                        System.out.println();
                                    }
                                }
                            }
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < GameBackground.length; j++) {
                        for (int k = 0; k < GameBackground[0].length; k++) {
                            System.out.print(GameBackground[j][k]);
                            if (k == GameBackground[0].length - 1) {
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
        System.out.println("你赢了，恭喜你");
        System.out.println();
        GameChoice2();
    }
}
