package com.jiangNan.thinkInJava.D4;

import java.util.Random;

/**
 * @class: forEach
 * @description:  forEach循环
 * @author:grolia
 * @date: 2019-07-28 22:09
 */
public class forEach {

    /**
     * java SE5引进了一个新的for语法用于数组和容器，不必创建int变量去对由访问像构成的序列进行技术
     *
     */
    public static void forEach(){
        char array[] = new char[140];
        for (int i = 0; i < 140; i++) {
            array[i] = (char) i;
        }
        for (int num: array) {
            System.out.println(num);
        };
    }

    /**
     * return,break,continue
     * @param flag flag
     */
    public  static void returnMethod(int flag){
        if(flag == 1){
            /*
               java中return有2个使用方式:
               1:一方面制指定一个方法的返回值（void）
               2：导致当且方法推出，并返回那个值
             */
           if(flag == 1){
               System.out.println("这是一个return的标记");
           }else if (flag == 2){
              /*
                java中break用于强制退出循环，不执行循环中剩余的语句
                contiune则是停止当前的的迭代，然后推出循环其起始点，开始下一次循环
               */
                for(int i=1;i<=20;i++ ){
                    if(i ==  (flag*i)){
                        System.out.println("这是contiune，会直接到下一次循环开始");
                        continue;
                    }
                    if(i == 15){
                        System.out.println("break啦啦啦啦");
                        break;
                    }
                    System.out.println("很正常的哦0-0");
                }
           }
        }
    }



    public static void main(String[] args) {
        forEach();
    }
}
