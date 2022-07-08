package package_one;

/*
 * @Author : 墨宣
 * @Time : 2022/7/5 14:43
 * @File : classone
 * 任务 :
 */

import java.util.*;

import static sun.net.www.http.KeepAliveCache.result;

/**
 * @author feng
 */
public class classone {
    public static void main(String[] args) {
        classone classone = new classone();
        Scanner scanner = new Scanner(System.in);
        List<List<String>> list = new ArrayList<>();
        list = classone.solveNQueens(scanner.nextInt());
        for (List<String> s : list) {
            System.out.println(s);
        }
        scanner.close();
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        String[][] strs = [","];
        return list;
    }
}
