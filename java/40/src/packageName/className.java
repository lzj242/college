package packageName;
<<<<<<< HEAD
class Complex {
    int real1, real2, empty1, empty2;
    String c;
    public String add(){
        int real,empty;
        real=real1+real2;
        empty=empty1+empty2;
        if(empty!=0&&real!=0)
        {
            c=real1+"+"+empty1+"i+"+real2+"+"+empty2+"i的结果为："+real+"+"+empty+"i";
        }
        else if (empty!=0&&real==0){
            c=real1+"+"+empty1+"i+"+real2+"+"+empty2+"i的结果为："+empty+"i";
        }
        else if(empty==0&&real!=0){
            c=real1+"+"+empty1+"i+"+real2+"+"+empty2+"i的结果为："+real;
        }
        else{
            c=real1+"+"+empty1+"i+"+real2+"+"+empty2+"i的结果为：0";
        }
        return c;
    }
}

public class className {
    public static void main(String[] args) {

        Complex complex1=new Complex();
        complex1.real1=10;
        complex1.real2=18;
        complex1.empty1=5;
        complex1.empty2=32;
        System.out.println(complex1.add());
        Complex complex2=new Complex();
        complex2.real1=10;
        complex2.real2=-10;
        complex2.empty1=7;
        complex2.empty2=6;
        System.out.println(complex2.add());
        Complex complex3=new Complex();
        complex3.real1=125;
        complex3.real2=1;
        complex3.empty1=-8;
        complex3.empty2=8;
        System.out.println(complex3.add());
        Complex complex4=new Complex();
        complex4.real1=21;
        complex4.real2=-21;
        complex4.empty1=6;
        complex4.empty2=-6;
        System.out.println(complex4.add());
=======
import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;

import java.util.Scanner;
public class className {
    public static void main(String[] args) {


>>>>>>> db595bd355b1cec33c01208e0dac83cba1399e4d
    }
}
