package a;


import java.util.Scanner;
import java.util.Arrays;
public class b {
    public static void main(String[] args) {
        int t;
        Scanner input=new Scanner(System.in);
        t=input.nextInt();
        String str=input.next();
        char[] helloArray = str.toCharArray();
        for(int i=0;i<helloArray.length;i++){
            if(helloArray[i]+t<='Z') {
                helloArray[i]+= t;
            }
            else{
                helloArray[i]-=26-t;
            }
        }
        String str1=String.valueOf(helloArray);
        System.out.print(str1);
    }
}
