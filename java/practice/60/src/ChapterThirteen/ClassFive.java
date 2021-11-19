package ChapterThirteen;

/**
 * @Author 墨宣
 * @Date 2021/10/30 21:51
 * 目的：
 */

import java.time.Period;
import java.util.Scanner;

public class ClassFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pppName = sc.next();
        int pppAge = sc.nextInt();
        String bpName = sc.next();
        int bpAge = sc.nextInt();
        String ppcName = sc.next();
        int ppcAge = sc.nextInt();
        String bcName = sc.next();
        int bcAge = sc.nextInt();
        /********* begin *********/

        // 测试运动员(乒乓球运动员和篮球运动员)
        // 乒乓球运动员
        PingPangPlayer ppp = new PingPangPlayer(pppName, pppAge);
        // 通过带参构造函数实例化PingPangPlayer对象ppp
        System.out.println(pppName + "---" + pppAge);
        // 输出'name---age'
        ppp.sleep();
        ppp.eat();
        ppp.study();
        ppp.speak();
        // 分别调用sleep()、eat()、study()、speak()方法
        /********* end *********/
        System.out.println("----------------");

        /********* begin *********/
        // 篮球运动员
        BasketballPlayer bp = new BasketballPlayer(bpName, bpAge);
        // 通过带参构造函数实例化BasketballPlayer对象bp
        System.out.println(bpName + "---" + bpAge);
        // 输出'name---age'
        bp.sleep();
        bp.eat();
        bp.study();
        // 分别调用sleep()、eat()、study()方法
        /********* end *********/
        System.out.println("----------------");

        /********* begin *********/
        // 测试教练(乒乓球教练和篮球教练)
        // 乒乓球教练
        PingPangCoach ppc = new PingPangCoach(ppcName, ppcAge);
        // 通过带参构造函数实例化PingPangCoach对象ppc
        System.out.println(ppcName + "---" + ppcAge);
        // 输出'name---age'
        ppc.sleep();
        ppc.eat();
        ppc.teach();
        ppc.speak();
        // 分别调用sleep()、eat()、teach()、speak()方法
        /********* end *********/
        System.out.println("----------------");

        /********* begin *********/
        // 篮球教练
        BasketballCoach bc = new BasketballCoach(bcName, bcAge);
        // 通过带参构造函数实例化BasketballCoach对象bc
        System.out.println(bcName + "---" + bcAge);
        // 输出'name---age'
        bc.sleep();
        bc.eat();
        bc.teach();
        // 分别调用sleep()、eat()、teach()方法
        /********* end *********/
        System.out.println("----------------");
    }
}

interface SpeakEnglish {
    /********* begin *********/
    public abstract void speak();
// 说英语接口 声明抽象方法speak()
    /********* end *********/
}


abstract class Person {
    /********* begin *********/
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 定义人的抽象类Person 封装name和age
    Person() {

    }

    // 无参构造函数
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 有参构造函数初始化name和age
    void sleep() {
        System.out.println("人都是要睡觉的");
    }

    // 定义具体方法sleep() 输出'人都是要睡觉的'
    abstract void eat();
// 抽象方法eat()（吃的不一样）
    /********* end *********/
}

abstract class Player extends Person {
    /********* begin *********/

// 定义运动员Player（抽象类）继承自Person类
    Player() {

    }

    // 无参构造函数
    Player(String name, int age) {
        super(name, age);
    }

    // 有参构造函数初始化name和age
    abstract void study();
// 运动员学习内容不一样，抽取为抽象 定义抽象方法study()
    /********* end *********/
}

abstract class Coach extends Person {
    /********* begin *********/

// 定义教练Coach（抽象类）继承自Person类
    Coach() {

    }

    // 无参构造函数
    Coach(String name, int age) {
        super(name, age);
    }

    // 有参构造函数初始化name和age
    abstract void teach();
// 教练教的不一样 定义抽象方法teach()
    /********* end *********/
}


class PingPangPlayer extends Player implements SpeakEnglish {
    /********* begin *********/
// 定义乒乓球运动员具体类PingPangPlayer 继承自Player类并实现SpeakEnglish类（兵乓球运动员需要说英语）
    PingPangPlayer() {

    }

    // 无参构造函数
    PingPangPlayer(String name, int age) {
        super(name, age);
    }

    // 有参构造函数初始化name和age
    @Override
    void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    // 实现自己的eat()方法 输出'乒乓球运动员吃大白菜，喝小米粥'
    @Override
    void study() {
        System.out.println("乒乓球运动员学习如何发球和接球");
    }

    // 实现自己的study()方法 输出'乒乓球运动员学习如何发球和接球'
    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
// 实现自己的speak()方法 输出'乒乓球运动员说英语'
    /********* end *********/
}

class BasketballPlayer extends Player {
    /********* begin *********/

// 定义篮球运动员具体类BasketballPlayer 继承自Player类 不需要继承接口，因为他不需要说英语
    BasketballPlayer() {

    }

    // 无参构造函数
    BasketballPlayer(String name, int age) {
        super(name, age);
    }

    // 有参构造函数初始化name和age
    @Override
    void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }

    // 实现自己的eat()方法 输出'篮球运动员吃牛肉，喝牛奶'
    @Override
    void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }
// 实现自己的study()方法 输出'篮球运动员学习如何运球和投篮'
    /********* end *********/
}


class PingPangCoach extends Coach implements SpeakEnglish {
    /********* begin *********/
// 定义乒乓球教练具体类 PingPangCoach 继承自Coach类并实现SpeakEnglish类（兵乓球教练需要说英语）
    PingPangCoach() {

    }

    // 无参构造函数
    PingPangCoach(String name, int age) {
        super(name, age);
    }


    // 有参构造函数初始化name和age
    @Override
    void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }
// 实现自己的eat()方法 输出'乒乓球教练吃小白菜，喝大米粥'

    @Override
    void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    // 实现自己的teach()方法 输出'乒乓球教练教如何发球和接球'
    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }


// 实现自己的speak()方法 输出'乒乓球教练说英语'
    /********* end *********/
}


class BasketballCoach extends Coach {
    /********* begin *********/
// 定义篮球教练具体类BasketballCoach 继承自Coach类 不需要继承接口，因为他不需要说英语
    BasketballCoach() {

    }

    // 无参构造函数
    BasketballCoach(String name, int age) {
        super(name, age);
    }

    // 有参构造函数初始化name和age
    @Override
    void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }

    // 实现自己的eat()方法 输出'篮球教练吃羊肉，喝羊奶'
    @Override
    void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }
// 实现自己的teach()方法 输出'篮球教练教如何运球和投篮'
    /********* end *********/
}
