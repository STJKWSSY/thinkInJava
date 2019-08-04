package com.jiangNan.thinkInJava.D5;

/**
 * @class: PrimitiveOverLoading
 * @description: 设计基本类型的重载
 * @author:grolia
 * @date: 2019-08-04 14:18
 */
public class PrimitiveOverLoading {
    /*
      基础类型能从一个较小的类型自动提升到一个较大的类型，此过程一旦涉及重载，就有可能造成一些混淆
     */

    /**
     * 重载char
     * @param x 重载char
     */
    public void f1(char x){
        System.out.println("f1(char)");
    }

    /**
     * 重载btye
     * @param b btye
     */
    public void f1(byte b){
        System.out.println("f1(btye)");
    }

    /**
     * 重载short
     * @param s short
     */
    public void f1(short s){
        System.out.println("f1(short)");
    }

    /**
     * 重载int
     * @param i int
     */
    public  void f1(int i){
        System.out.println("f1(int)");
    }

    /**
     * 重载ling
     * @param l  long
     */
    public  void f1(long l){
        System.out.println("f1(long)");
    }

    /**
     * 重载float
     * @param f float
     */
    public void f1(float f){
        System.out.println("f1(float)");
    }

    /**
     * 重载double
     * @param d double
     */
    public void f1(double d){
        System.out.println("f1(double)");
    }


    /***********************************f2*********************************/

    /**
     * 重载btye
     * @param b btye
     */
    public void f2(byte b){
        System.out.println("f2(btye)");
    }

    /**
     * 重载short
     * @param s short
     */
    public void f2(short s){
        System.out.println("f2(short)");
    }

    /**
     * 重载int
     * @param i int
     */
    public  void f2(int i){
        System.out.println("f2(int)");
    }

    /**
     * 重载ling
     * @param l  long
     */
    public  void f2(long l){
        System.out.println("f2(long)");
    }

    /**
     * 重载float
     * @param f float
     */
    public void f2(float f){
        System.out.println("f2(float)");
    }

    /**
     * 重载double
     * @param d double
     */
    public void f2(double d){
        System.out.println("f2(double)");
    }

    /*******************************f3************************************/

    /**
     * 重载short
     * @param s short
     */
    public void f3(short s){
        System.out.println("f3(short)");
    }

    /**
     * 重载int
     * @param i int
     */
    public  void f3(int i){
        System.out.println("f3(int)");
    }

    /**
     * 重载ling
     * @param l  long
     */
    public  void f3(long l){
        System.out.println("f3(long)");
    }

    /**
     * 重载float
     * @param f float
     */
    public void f3(float f){
        System.out.println("f3(float)");
    }

    /**
     * 重载double
     * @param d double
     */
    public void f3(double d){
        System.out.println("f3(double)");
    }

    /****************************f4*******************************/

    /**
     * 重载int
     * @param i int
     */
    public  void f4(int i){
        System.out.println("f4(int)");
    }

    /**
     * 重载ling
     * @param l  long
     */
    public  void f4(long l){
        System.out.println("f4(long)");
    }

    /**
     * 重载float
     * @param f float
     */
    public void f4(float f){
        System.out.println("f4(float)");
    }

    /**
     * 重载double
     * @param d double
     */
    public void f4(double d){
        System.out.println("f4(double)");
    }

    /************************************f5**************************************/

    /**
     * 重载ling
     * @param l  long
     */
    public  void f5(long l){
        System.out.println("f5(long)");
    }

    /**
     * 重载float
     * @param f float
     */
    public void f5(float f){
        System.out.println("f5(float)");
    }

    /**
     * 重载double
     * @param d double
     */
    public void f5(double d){
        System.out.println("f5(double)");
    }

    /***************************f6*****************************/

    /**
     * 重载float
     * @param f float
     */
    public void f6(float f){
        System.out.println("f6(float)");
    }

    /**
     * 重载double
     * @param d double
     */
    public void f6(double d){
        System.out.println("f6(double)");
    }

    /***************************f7******************************/
    /**
     * 重载double
     * @param d double
     */
    public void f7(double d){
        System.out.println("f7(double)");
    }

    /**************************testMethod*********************************/


    /**
     * 测试constVal
     */
    public void testConstVal(){
        System.out.println("int 5");
        f1(5);
        f2(5);
        f3(5);
        f4(5);
        f5(5);
        f6(5);
        f7(5);
    }

    /**
     * 测试char
     */
    public void testChar(){
        System.out.println("char 5");
        char c = 'c';
        f1(c);
        f2(c);
        f3(c);
        f4(c);
        f5(c);
        f6(c);
        f7(c);
    }

    /**
     * 测试byte
     */
    public void testByte(){
        byte x = 0;
        System.out.println("btye");
        f1(x);
        f2(x);
        f3(x);
        f4(x);
        f5(x);
        f6(x);
        f7(x);
    }

    /**
     * 测试short
     */
    public void testShort(){
        short s = 0;
        System.out.println("short");
        f1(s);
        f2(s);
        f3(s);
        f4(s);
        f5(s);
        f6(s);
        f7(s);
    }

    /**
     * 测试int
     */
    public void testInt(){
        int i = 0;
        System.out.println("int");
        f1(i);
        f2(i);
        f3(i);
        f4(i);
        f5(i);
        f6(i);
        f7(i);
    }

    /**
     * 测试long
     */
    public void testLong(){
        long l = 0L;
        System.out.println("long");
        f1(l);
        f2(l);
        f3(l);
        f4(l);
        f5(l);
        f6(l);
        f7(l);
    }

    /**
     * 测试float
     */
    public void testFloat(){
        float f = 1.0F;
        System.out.println("float");
        f1(f);
        f2(f);
        f3(f);
        f4(f);
        f5(f);
        f6(f);
        f7(f);
    }

    /**
     * 测试double
     */
    public void testDouble(){
        double d = 1.0;
        System.out.println("double");
        f1(d);
        f2(d);
        f3(d);
        f4(d);
        f5(d);
        f6(d);
        f7(d);
    }

    public static void main(String[] args) {
        PrimitiveOverLoading primitiveOverLoading = new PrimitiveOverLoading();
        // 你会发现5被当作int处理
        primitiveOverLoading.testConstVal();
        System.out.println("----------------------------");
        /*
           如果传入的参数类型（实际参数类型）小于方法声明的参数类型,实际参数类型就会提升
         */
        primitiveOverLoading.testByte();
        System.out.println("----------------------------");
        primitiveOverLoading.testShort();
        System.out.println("----------------------------");
        primitiveOverLoading.testInt();
        System.out.println("----------------------------");
        primitiveOverLoading.testInt();
        System.out.println("----------------------------");
        primitiveOverLoading.testLong();
        System.out.println("----------------------------");
        primitiveOverLoading.testFloat();
        System.out.println("----------------------------");
        primitiveOverLoading.testDouble();
        System.out.println("----------------------------");
        // Tips: char类型不同于如果无法找到接受char参数的，会自动提升到int
        primitiveOverLoading.testChar();
        /*
          方法接受较小的基本类型作为参数。
          如果传入的实际参数较大，就得通过类型转化来执行窄化
         */
    }
}
