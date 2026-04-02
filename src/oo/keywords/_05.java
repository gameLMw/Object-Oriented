package oo.keywords;

/*
* 枚举 enum
* 继承与java.lang.Enum  。不能继承其他类
* */

public class _05 {
    public static void main(String[] args) {
        //jdk5之前定义枚举的方法
        System.out.println(Season.SPRING);

        //jdk5之后定义枚举的方法
        System.out.println(Season1.SPRING);

        //测试方法
        //toString()
        //输出枚举对象
        System.out.println(Season1.SPRING.toString());
        System.out.println(Season1.SUMMER.toString());

        //name()
        //输出枚举对象变量名
        System.out.println(Season1.SPRING.name());
        System.out.println(Season1.SUMMER.name());

        //vlaues()
        //获取枚举对象
        Season1[] values = Season1.values();
        for (Season1 season : values) {
            System.out.println(season);
        }

        //valueOf(String objName)
        //参数：枚举对象变量名
        //返回枚举对象，没有直接报错
        String objName = "SPRING";
        Season1 season = Season1.valueOf(objName);
        System.out.println(season);

        //ordinal()
        //返回当前枚举对象在枚举对象数组中是第几个声名的对象
        System.out.println(Season1.SPRING.ordinal());

        //枚举类实现接口1，在枚举类中实现
        Season1.SPRING.show();

        //枚举类实现接口2，在具体的每个枚举属性中实现
        Season1.SPRING.show();
        Season1.SUMMER.show();
    }
}

interface Info{
    void show();
}

//jdk5之前定义枚举的方法
class Season{
    //1. 声名当前类的对象的实例对象,需要private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2. 私有化构造器
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3. 提供获取当前枚举对象的方法

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4. 创建当前类的实例,需要public static final修饰
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

//jdk5之后定义枚举的方法,enum
enum Season1 implements Info{
    //1. 必须在枚举类的开头声名多个对象
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋意浓");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    //2. 声明枚举类的属性
    private final String seasonName;
    private final String seasonDesc;

    //3. 私有化构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4. 提供获取枚举对象的方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

/*    public void show(){
        System.out.println("这是一个枚举对象");
    }*/
}
