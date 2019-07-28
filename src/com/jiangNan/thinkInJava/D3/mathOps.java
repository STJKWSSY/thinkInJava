package com.jiangNan.thinkInJava.D3;

import java.util.Random;


/**
 * @class: mathOps
 * @description:  java中的算术运算符
 * @author:grolia
 * @date: 2019-07-23 22:13
 */
public class mathOps {

    /**
     * java各种运算符 一元运算符
     */
    public static void  mathOps(){
        Random r1 = new Random();
        Random r2 = new Random();
        int i = r1.nextInt(100) + 1;
        int j = r2.nextInt(10) + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println(" i + j = " + (i + j));
        System.out.println(" i - j = " + (i - j));
        System.out.println(" i * j = " + (i * j));
        System.out.println(" i / j = " + (i / j));
        System.out.println(" i % j = " + (i % j));
        System.out.println(" i + j = " + (i + j));
        short s1 = 2;
        int   i2 = 3;
        long  l3 = 9L;
        System.out.println("short + int = " +  (s1 + i2));
        System.out.println("short + long = " + (l3 + s1));
    }

    /**
     * java自增运算
     *
     */
    public static void autoMathOps(){
        /*
            自增分为前缀和后缀,前缀表示++操作符在变量或者是表达式的前面，而后缀是++操作符位于变量或者是表达式的后面
            对于前缀,会先执行运算后后生成值
            对于后缀,会先生成值在执行运算
         */
        int i = 1;
        System.out.println("i = " + i);
        System.out.println("前缀++ :" + (++i) );
        System.out.println("后缀++ :" + (i++));
        System.out.println("i :" + i);
        System.out.println("前缀-- :" + (--i));
        System.out.println("后缀-- :" + (i--));
        System.out.println("i :" + i);
    }

    /**
     * java逻辑运算符
     * 逻辑运算符 或,与，非
     */
    public static void logicBool(){
        Random random = new Random();
        int i = random.nextInt(100);
        int  j = random.nextInt(100);
        System.out.println("i == j" + (i == j));
        System.out.println("i > j" + (i > j));
        System.out.println("i < j" + (i  < j));
    }

    /**
     * java短路
     * 一旦能够明确无误的确定整个表达式的值，就不再计算表达式的余下部分了，会获得现在性能的提升
     */
    public static void shortCircuit(){
         boolean b = (test1(1) || test2(2)) && test3(3);
    }

    /**
     *  test1
     * @param val
     * @return boolean
     */
    public static boolean test1(int val){
        System.out.println("test1 < 1");
        return val < 1;
    }

    /**
     * test2
     * @param val
     * @return boolean
     */
    public  static boolean test2(int val){
        System.out.println("test2 < 2");
        return val < 2;
    }

    /**
     * test3
     * @param
     * @return boolean
     */
    public static boolean test3(int val){
        System.out.println("test3 < 3");
        return val < 3;
    }


    /**
     * java字符串操作符 + / +=
     * 操作符重载
     */
    public static void stringMathOps(){
        int x = 0, y = 1, z = 2;
        String s = "x , y, z";
        System.out.println(s + x + y + z);
        System.out.println(" " + z);
    }

    /**
     * 类型转化操作符
     * Java会将一种数据类型转换为另一种，编译器允许我们显式的进行类型进行转换，或者是在不能转化的时候强制转换
     *  对于扩展转换，则不必显示的进行类型转换.
     *
     */
    public static void castObject(){
     int  x = 200;
     long i = (long)x;
     long lng2 = 200;
     lng2 = 200;
    }

    /**
     *  截尾和窄化=> 最大即结果类型
     *  强制类型转换，执行窄化是，必须注意截尾和舍入问题
     *
     */
    public static void castingNumbers(){
        double above = 0.7 ,below = 0.4;
        float  fabove = 0.7f,fbelow = 0.4f;
        /*
          0,0,0,0
         */
        System.out.println("(int) above :" + (int)above);
        System.out.println("(int)below : " + (int)below);
        System.out.println("(int)fabove :" + (int)fabove);
        System.out.println("(int)fbelow :" + (int)fbelow);
    }

    /**
     * 越界/溢出
     *
     */
    public static void overFlow(){
        int maxBig = Integer.MAX_VALUE;
        System.out.println("maxBig = " + maxBig);
        System.out.println("overFlow = " + (maxBig * 4));
    }

    public static void main(String[] args) {
       overFlow();
    }



}
