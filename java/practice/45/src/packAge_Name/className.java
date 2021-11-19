package packAge_Name;
/**
 * 任务：实现手机的基本功能。
 * 类名为：Phone
 */

public class className {

// 请在下面的Begin-End之间按照注释中给出的提示编写正确的代码

/********** Begin **********/

    // 定义五个变量，分别表示品牌、型号、价格、操作系统和内存
    String brand;
    String type;
    double price;
    String os;
    String memory;
    // 无参构造
    className()
    {
        this.memory=memory;
        this.os=os;
        this.brand=brand;
        this.type=type;
        this.price=price;
    }


    public void about() {
        /**
         * 定义一个方法，该方法实现查询手机信息的方法，无返回值
         * 输出格式：品牌：xx
         *           型号：xx
         *           操作系统：xx
         *           价格：xx
         *           内存：xx
         * 中间用换行符隔开
         */
        System.out.println("品牌："+brand+"\n型号："+type+"\n操作系统："+os+"\n价格："+price+"\n内存："+memory);
    }

    public void call(int number) {
        /**
         * 定义一个方法，该方法实现打电话的功能，无返回值，
         * 携带一个int型参数，其中1,2,3分别表示爸爸、妈妈、姐姐的号，
         * 输出格式  如果参数为1，换行输出：正在给爸爸打电话
         * 如果出现其它情况，换行输出：你所拨打的电话为空号
         */
        if (number==1) {
            System.out.println("正在给爸爸打电话");
        }
        else if (number==2){
            System.out.println("正在给妈妈打电话");
        }
        else if(number==3){
            System.out.println("正在给姐姐打电话");
        }
        else {
            System.out.println("你所拨打的为空号");
        }
    }

    public void play(String musicName) {
        /**
         * 定义一个方法，该方法实现听音乐的功能，无返回值
         * 携带一个参数，其表示为歌曲名
         * 不换行输出格式：正在播放xx
         */
        System.out.println("正在播放"+musicName);
    }


    // 定义主方法
    public static void main(String[] args) {
        className classname=new className();
        classname.memory="8";
        classname.price=2599;
        classname.type="小米9";
        classname.brand="小米";
        classname.os="Android 9";
        classname.about();
        classname.call(2);
        classname.play("浮夸");
    }

    // 通过无参构造创建手机对象

    // 设置手机品牌为小米，型号为小米9，操作系统为Android 9，价格为2599，运行内存为8

    // 查询手机信息

    // 给妈妈拨打电话

    // 播放浮夸这首歌


/********** End **********/

}
