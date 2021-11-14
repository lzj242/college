package ChapterThirteen;

/**
 * @Author 墨宣
 * @Date 2021/10/26 20:36
 * 目的：
 */

import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dogName = sc.next();
        String dogSex = sc.next();
        String dogColor = sc.next();
        String catName = sc.next();
        String catSex = sc.next();
        double catWeight = sc.nextDouble();
<<<<<<< HEAD
        Dog dog = new Dog(dogName, dogSex, dogColor);
=======
        Dog dog = new Dog(dogName,dogSex,dogColor);
>>>>>>> main
        // 通过有参构造函数实例化Dog类对象dog
        dog.talk();
        // dog调用talk()方法
        dog.eat();
        // dog调用eat()方法
        /********* begin *********/

        /********* end *********/
<<<<<<< HEAD
        Cat cat = new Cat(catName, catSex, catWeight);
=======
        Cat cat = new Cat(catName,catSex,catWeight);
>>>>>>> main
        // 通过有参构造函数实例化Cat类对象cat
        cat.talk();
        // cat调用talk()方法
        cat.eat();
        // cat调用eat()方法
        /********* begin *********/

        /********* end *********/
    }
}

abstract class Pat {
    /********* begin *********/
<<<<<<< HEAD
    String name, sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String name) {
        this.sex = sex;
    }

=======
    String name,sex;
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setSex(String name) {
        this.sex=sex;
    }
>>>>>>> main
    public String getSex() {
        return sex;
    }

<<<<<<< HEAD
    // 抽象类Pet 封装属性name和sex
    public Pat(String name, String sex) {
=======
// 抽象类Pet 封装属性name和sex
    public Pat(String name,String sex) {
>>>>>>> main
        this.name = name;
        this.sex = sex;
    }

    // 构造函数初始化name和sex
    abstract void talk();
<<<<<<< HEAD

=======
>>>>>>> main
    // 声明抽象方法talk()
    abstract void eat();
// 声明抽象方法eat()
    /********* end *********/
}
<<<<<<< HEAD

class Dog extends Pat {
    /********* begin *********/
    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Dog类继承自Pet类 封装属性color
    public Dog(String dogName, String dogsex, String dogColor) {
        super(dogName, dogsex);
        this.color = dogColor;
    }

    // 构造函数初始化name、sex和color
    @Override
    public void talk() {
        System.out.println("名称：" + name + "，性别：" + sex + "，颜色：" + color + "，汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println(name + "吃骨头！");
    }
=======
class Dog extends Pat {
    /********* begin *********/
    String color;
    public void setColor(String color) {
        this.color=color;
    }
    public String getColor() {
        return color;
    }
// Dog类继承自Pet类 封装属性color
    public Dog(String dogName,String dogsex,String dogColor){
        super(dogName,dogsex);
        this.color=dogColor;
    }
// 构造函数初始化name、sex和color
@Override
public void talk(){
    System.out.println("名称："+name+"，性别："+sex+"，颜色："+color+"，汪汪叫");
}
@Override
public void eat(){
    System.out.println( name+"吃骨头！");
}
>>>>>>> main
// 实现自己的talk()方法和eat()方法
// talk()输出'名称：name，性别：sex，颜色：color，汪汪叫'
// eat()输出'name吃骨头'
    /********* end *********/
}
<<<<<<< HEAD

class Cat extends Pat {
    double weight;

    /********* begin *********/
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    // Cat类继承自Pet类 封装属性weight
    public Cat(String catName, String catSex, double catWeight) {
        super(catName, catSex);
        this.weight = catWeight;

    }

    // 构造函数初始化name、sex和weight
// 实现自己的talk()方法和eat()方法
    @Override
    public void talk() {
        System.out.println("名称：" + name + "，性别：" + sex + "，体重：" + weight + "kg，喵喵叫");
    }

    // talk()输出'名称：name，性别：sex，体重：weight kg，喵喵叫'
    @Override
    public void eat() {
        System.out.println(name + "吃鱼！");
    }
=======
class Cat extends Pat {
    double weight;
    /********* begin *********/
    public void setWeight(double weight) {
        this.weight=weight;
    }
    public double getWeight() {
        return weight;
    }
// Cat类继承自Pet类 封装属性weight
    public Cat(String catName,String catSex,double catWeight){
        super(catName,catSex);
        this.weight=catWeight;

    }
// 构造函数初始化name、sex和weight
// 实现自己的talk()方法和eat()方法
    @Override
    public void talk(){
        System.out.println("名称："+name+"，性别："+sex+"，体重："+weight+"kg，喵喵叫");
    }
// talk()输出'名称：name，性别：sex，体重：weight kg，喵喵叫'
@Override
public void eat(){
    System.out.println( name+"吃鱼！");
}
>>>>>>> main
// eat()输出'name吃鱼'
    /********* end *********/
}

