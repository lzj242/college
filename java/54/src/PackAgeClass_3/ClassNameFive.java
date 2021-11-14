package PackAgeClass_3;

/**
 * @Author 墨宣
 * @Date 2021/10/12 19:10
 * 目的：循环嵌套
 */
public class ClassNameFive {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("我爱你");
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
                if (j == 4) {
                    System.out.print("\n");
                }
            }
        }
    }
}
