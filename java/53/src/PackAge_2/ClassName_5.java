package PackAge_2;

/**
 * @Author 墨宣
 * @Date 2021/10/11 19:48
 * 目的：自增字减运算符进阶
 */
public class ClassName_5 {
    public static void main(String[] args) {
        int k=3;
        int p=5;
        //k 3 4 5 4
        //p 5 a4 3 4
        //rs  3+5-4+4-5+4+2
        int rs=k++ + ++k - --p + p-- -k-- + ++p +2;
        System.out.println(k);
        System.out.println(p);
        System.out.println(rs);
        int c=10;
        int d=5;
        //c 10 11 12 11
        //d 5 4 5
        //rs1  10+12-4-5+1+12
        int rs1=c++ + ++c - --d - ++d +1 + c--;
        System.out.println(c);
        System.out.println(d);
        System.out.println(rs1);
    }
}
