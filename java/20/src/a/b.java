package a;
import java.util.Scanner;
import java.util.Random;
/**
 * @author HUAWEI
 */
public class b {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int m,t;
        m=reader.nextInt();
        int []a=new int [m];
        t= reader.nextInt();
        Random random=new Random(t);
        for (int i=0;i<m;i++){
<<<<<<< HEAD
            a[i]=random.nextInt(20);
=======
            a[i]=random.nextInt(m);
>>>>>>> main
        }
        int []d=new int [m];
        for(int i=0;i<m;i++){
            d[a[i]]++;
        }
<<<<<<< HEAD
        for(int i=0;i<20;i++){
=======
        for(int i=0;i<m;i++){
>>>>>>> main
            if(d[i]>0) {
                System.out.printf("%d出现了:%d 次\n",i,d[i]);
            }
        }
    }
}
