package PackAge_2;

/**
 * @Author 墨宣
 * @Date 2021/10/11 20:44
 * 目的：三元运算符
 */
public class ClassNameEight {
    public static void main(String[] args) {
        double score=98;
        String rs=score>=60?"考试通过":"挂科";
        System.out.println(rs);
        int a=10;
        int b=200;
        System.out.println(a>b?a:b);
        System.out.println("-----------------");
        int i=10;
        int j=30;
        int k=50;
        int temp;
        temp=i>j?i:j;
        temp=temp>k?temp:k;
        System.out.println(temp );
        System.out.println("--------拓展知识----------");
        int rsMax=(i>j?i:j)>k?(i>j?i:j):k;
        System.out.println(rsMax);
    }
}
