package com.jiangNan.thinkInJava.D3;

import com.jiangNan.thinkInJava.entity.Tank;

/**
 * @class: Assignment
 * @description: java对象引用赋值
 * @author:grolia
 * @date: 2019-07-23 21:43
 */
public class Assignment {


    public static void main(String[] args) {
        passObject();
    }

    /**
     * 对象引用传递
     *
     */
    public static void assignObject(){
         /*
          由于操作的是对象的引用，所以修改t1的同时也就修改了t2，因为t1和t2有着相同的引用，他们指向同一个对象
          （t1对象半酣的对象是指向一个人值为9的对象，在对t1赋值的时候，这个引用会被覆盖，也就丢失了，而那个不会被使用的对象会被GC自动清理）
         */
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        System.out.println("1 : t1.level " + t1.level + ", t2.level :" + t2.level);
        t1 = t2;
        System.out.println("2 : t1.level " + t1.level + ", t2.level :" + t2.level);
        t1.level = 27;
        System.out.println("3 : t1.level " + t1.level + ", t2.level :" + t2.level);
    }

    /**
     * 方法调用中的别名问题
     *
     */
    public  static void passObject (){
        Tank tank = new Tank();
        tank.level = 1;
        System.out.println("1 : tank.level = " + tank.level);
        f(tank);
        System.out.println("2 : tank.level = " + tank.level);
    }

    /**
     * 传递对象 -》java的别名机制
     *
     * @param tank
     */
    public static void f(Tank tank){
        /*
          方法f()似乎是要在他的作用域内复制其参是Tank的一个副本，但实际上只是传递了一个引用，所以 tank.level = 9;实际上是改变的是f()之外的对象
         */
        tank.level = 9;
    }
}
