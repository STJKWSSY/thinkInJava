package com.jiangNan.thinkInJava.D5;

/**
 * @class: Initialize
 * @description: 用构造器确保初始化
 * @author:grolia
 * @date: 2019-08-01 21:50
 */
public class Initialize {
   public String  defaultValue = "123";
   public String  consValue = "";
   public String  treeName;
   public int  age;
   public int  height;
    /**
     * 默认构造器
     */
    public Initialize(){
        //java会默认创建默认构造器，在创建对象的时候，会为对象分配存储空间，并调用相应的构造器，确保操作对象之前就初始化
    }

    /**
     * 带有参数的构造器
     * @param consValue 构造器参数
     */
    public Initialize(String consValue) {
        this.consValue = consValue;
    }

    /**
     * 方法重载1
     *
     * @param treeName treeName
     * @param age age
     * @param height  高度
     */
    public void tree(String treeName,int age,int height){
        /*
          1.语言具有冗余性，即使缺少几个词组，也可以领会其意思，不需要对每一个概念都是用不同的词汇描述
          2.构造器是强制使用重载方法名的一个原因，确保可以有多个构造器同时存在
         */
        this.treeName = treeName;
        this.age = age;
        System.out.println("重载方法1 ：" +  "这棵树叫做" + treeName + "它有 "+ age +"岁啦");
    }




    /**
     * 方法重载2
     *
     * @param treeName treeName
     */
    public void tree(String treeName){
        /*
           区别方法的重载，每一个重载的方法都有一个唯一的参数列表(参数的类型和数量，名称不同不算，参数类型顺序不同算)
         */
        this.treeName = treeName;
        System.out.println("我只知道这颗树叫做 " + treeName);
    }

    public static void main(String[] args) {
        Initialize i1 = new Initialize();
        System.out.println("i1 " + i1.defaultValue + "i1 =" + i1.consValue);
        Initialize i2 = new Initialize("cons");
        System.out.println("i2 " + i2.defaultValue + "i2  =" + i2.consValue);
    }
}
