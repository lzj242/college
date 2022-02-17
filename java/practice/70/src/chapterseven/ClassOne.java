package chapterseven;

/**
 * @Author 墨宣
 * @Date 2022/2/6 17:39
 * 目的：
 */
import java.lang.Object;
class Parent{
    public Parent(){
        System.out.println("父类构造");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("子类构造");
    }
}
public class ClassOne {
    public static void main(String[] args) {
        Child child=new Child();
        System.out.println(ClassOne.class.getName());
    }
}
