package a;
/**
 * 任务：判断一个给定的 5 位数是否是一个回文数
 */
import java.util.Scanner;
public class b {
  public static void main(String[] args) {
    //
      int n,g,s,b,q,w;
      Scanner reader=new Scanner(System.in);
      n=reader.nextInt();
      w=n/10000;
      q=(n%10000)/1000;
      b=(n%1000)/100;
      s=(n%100)/10;
      g=(n%10);
      if(w==g&&q==s){
      System.out.println("回文数");
      }
      else{
      System.out.println("不是回文数");
      }
  }
}
