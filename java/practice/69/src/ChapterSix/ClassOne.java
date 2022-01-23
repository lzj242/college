package ChapterSix;

/**
 * @Author 墨宣
 * @Date 2022/1/23 18:14
 * 目的：类和对象
 */
public class ClassOne {
    public static void main(String[] args) {
        EggCake eggCake = new EggCake();
        System.out.println("有" + eggCake.eggcount + "个蛋");
        EggCake eggCake1 = new EggCake(2);
        System.out.println("有" + eggCake1.eggcount + "个蛋");
    }
}

class EggCake {
    int eggcount;

    EggCake(int eggcount) {
        this.eggcount = eggcount;
    }

    EggCake() {
        this.eggcount=1;
    }
}
