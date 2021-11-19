package a;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n>=0)
        {
            if(n%2!=0){
                System.out.println("该数为自然数，但不是偶数");
            }
            else{
                System.out.println("该数既是自然数又是偶数");
            }
        }
        else{
            System.out.println("该数不是自然数");
        }
    }
}
