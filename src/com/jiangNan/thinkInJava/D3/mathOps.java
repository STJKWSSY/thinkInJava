package com.jiangNan.thinkInJava.D3;

import java.util.Random;


/**
 * @class: mathOps
 * @description:  java中的算术运算符
 * @author:grolia
 * @date: 2019-07-23 22:13
 */
public class mathOps {

    public static void main(String[] args) {
        shortCircuit();
    }

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
}
