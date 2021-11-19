package a;
import java.util.Scanner;



public class b {
  public static void main(String[] args) {
    //
      char c;
      Scanner reader=new Scanner(System.in);
      c = reader.next().charAt(0);
      c+=32;
    System.out.print((char) c);
  }
}
