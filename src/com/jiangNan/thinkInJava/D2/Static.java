package com.jiangNan.thinkInJava.D2;

/**
 * @class: Static
 * @description: static关键字
 * @author:grolia
 * @date: 2019-07-21 22:17
 */
public class Static {
    /*
     当声明一个事物static，就意味着这个域或方法不会与包含它的那个类的任何对象实例关联在一起
     所以即使从未创建某个类的任何对象都可以调用其static的方法或者访问static属性（类对象和类属性）
     */

    private  static int num;
    private  static  String  value;
    private  int seed;


    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Static.num = num;
    }

    public static String getValue() {
        return value;
    }

    public static void setValue(String value) {
        Static.value = value;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    /**
     * 静态方法设置静态属性
     * @param staticValue
     * @return
     */
    public static void staticString(String staticValue,int staticInt){
        value = staticValue;
        num = staticInt;
        System.out.println("value 的值是" + value + "num 的值是" + num);
    }

    /**
     * 非静态方法
     * @param seedValue seedValue
     */
    public  void seddValue(int seedValue){
        seed = seedValue;
        System.out.println("seed 的值是"  + seed);
        System.out.println("value 的值是" + value + "num 的值是" + num);
    }

    /**
     *  静态方法只能通过类调用，同样静态属性类共享，而且对象是无法更改的
     * @param args args
     */
    public static void main(String[] args) {
        Static.staticString("静态的str",1);
        Static s = new Static();
        s.seddValue(123);
        Static.staticString("静态的str2",2);
        s.seddValue(456);
    }
}
