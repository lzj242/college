package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/18 11:21
 * 目的：
 */
public class ClassOne {
    public static void main(String[] args) {
        try {
            String str = "lii";
            System.out.println(str + "年龄是:");
            int age = Integer.parseInt("20L");
            System.out.println(age);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("program over");
        }
    }
}
