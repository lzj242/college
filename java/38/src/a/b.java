package a;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        StringBuffer str1 = new StringBuffer(str);
        int first,second,j=8,k=18;
        first=str1.indexOf("()");
        second=str1.indexOf("()",first+1);
        while (j<13&&k<23){
            if(k<20) {
                str1.insert(first + 1, j);
                str1.insert(second + 2, k);
            }
            else {
                str1.insert(first + 1, j);
                str1.insert(second + 3, k);
            }
            System.out.println(str1);
            j++;
            k++;
            str1.delete(0,str1.length());
            str1=new StringBuffer(str);
        }
    }
}
