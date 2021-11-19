package ChapterThirteen;

/**
 * @Author 墨宣
 * @Date 2021/10/17 15:58
 * 目的：
 */
public class ClassOne {

    /**
     * 按照动物、宠物、猫和蜘蛛的关系，通过编程实现各自的关系并声明自己的属性和方法。
     */

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.walk();
        Cat cat = new Cat("Kitty");
        System.out.println("小猫的名字叫：" + cat.getName());
        cat.walk();
        cat.play();
        cat.eat();

    }
}

abstract class Animal {
    // 创建Animal类，它是所有动物的抽象父类
    protected String type;
    // 声明一个受保护的字符串类型属性type，它记录动物的种类
    protected int legs;

    // 声明一个受保护的整数类型属性legs，它记录动物的腿的数目
    protected Animal(String type, int legs) {
       this.type = type;
        this.legs = legs;
    }

    // 定义一个受保护的有参构造器，用来初始化type和legs属性
    public abstract void eat();

    // 声明抽象方法eat，无返回值
    public void walk() {
        System.out.println(type+"用 " + legs + " 条腿走路");
    }

    public abstract void talk();
    // 声明具体方法walk来打印动物是如何行走的（包括腿的数目）。
    // 输出格式：用 xx 条腿走路

}

// 定义蜘蛛类 Spider继承Animal类
class Spider extends Animal {

    public Spider() {
        super("spider", 8);
    }

    // 定义默认构造器，它调用父类构造器来指明动物类别是spider，且所有蜘蛛都是8条腿。
    @Override
    public void eat() {
        System.out.println("spider eating");
    }

    // 实现eat方法，输出：spider eating
    public interface pet {

// 创建pet（宠物）接口

        void setName(String name);


        // 提供setName(String name) 为该宠物命名
        String getName();

        // 提供getName() 返回该宠物的名字，返回类型为String
        void play();
        // 提供 play()方法，无返回值

    }
}

// 定义公开的猫类 Cat 继承动物类并实现宠物接口
 class Cat extends Animal implements Spider.pet {
    // 定义一个name属性来存宠物的名字
    String name;

    public Cat(String name) {

        super("cat",4);
        this.name=name;
    }
    // 定义一个有参构造器，它使用String参数指定猫的名字
    // 该构造器必须调用超类构造器来指明动物种类是cat，且所有的猫都是四条腿

    // 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
    public Cat() {
        this("");
    }

    // 实现 Pet接口的方法
    // 设置猫的名称
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
    // 获取猫的名称

    // 重写 Animal 类的play()，输出：Cat is playing
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eating");
    }
    // 重写 Animal 类的eat()，输出：xx eating
    // xx 表示姓名
}