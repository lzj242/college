package a;

public class Complex {
    Complex(){};
    int real1, real2, image1, image2, real, image;
     public String add() {

        String S="";

        real = real1 + real2;
        image = image1 + image2;
        if (image != 0 && real != 0) {
            S = real + "+" + image + "i";
        } else if (image != 0 && real == 0) {
            S = image + "i";
        } else if (image == 0 && real != 0) {
            S =  String.valueOf(real) ;
        } else {
            S = "0" ;
        }
        return S;
    }
}

public class TestMain {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.real1 = 10;
        c.image1 = 5;
        c.real2 = 18;
        c.image2 = 32;
        Complex c1 = new Complex();
        c1.real1 = 10;
        c1.image1 = 7;
        c1.real2 = -10;
        c1.image2 = 6;
        Complex c2 = new Complex();
        c2.real1 = 125;
        c2.image1 = -8;
        c2.real2 = 1;
        c2.image2 = 8;
        Complex c3 = new Complex();
        c3.real1 = 21;
        c3.image1 = 6;
        c3.real2 = -21;
        c3.image2 = -6;
        System.out.println("10+5i+18+32i的结果为：" + c.add());
        System.out.println("10+7i+(-10)+6i的结果为：" + c1.add());
        System.out.println("125+(-8i)+1+8i的结果为：" + c2.add());
        System.out.print("21+6i+(-21)+(-6i)的结果为：" + c3.add());

    }
}
