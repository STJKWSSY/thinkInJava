package com.jiangNan.thinkInJava.D4;

import java.util.Random;

/**
 * @class: ifAndChoose
 * @description: 控制执行流程
 * @author:grolia
 * @date: 2019-07-25 22:01
 */
public class ifAndChoose {

    /**
     * if/else
     *
     */
    public static void ifAndElse(){
        int flag = 1;
        if(flag == 1){
            System.out.println(" 这是1");
        }else if(flag == 2){
            System.out.println(" 这是2");
        }else{
            System.out.println(" 这是3");
        }
     }

    /**
     * 迭代 while/do-while/for
     * @param choose  选择类型
     */
    public static void whileTest(int choose){
        Random random = new Random();
        int flag = random.nextInt(100);
        if(choose == 1){
            while (flag > 70){
                System.out.println("欢迎进入70分!!!! flag = " + flag);
            }
        }else if(choose == 2){
            do {
                // doWhile和while的区别是doWhile的语句至少会执行一次，即使他是flase
                System.out.println("这里是do_while哦 flag = " + flag);
            } while (flag < 50);
        }else if(choose == 3){
             for(char c = 0;c < 128; c++){
                 if(Character.isLowerCase(c)){
                     //java.lang.Character包提供了是否是小写字母API

                     System.out.println("这是小写的字母 " + c +"数值是" + (int)c);
                 }
             }
        }else {
            //逗号操作符,java允许在for循环中使用逗号操作符(不是逗号分隔符)，可以定义多个变量但是必须是相同类型
            for (int i = 10,j = 0; j < 6; i++, j= i+1) {
                System.out.println("i = " + i + "j =" + j);
            }
        }

     }

    public static void main(String[] args) {
        whileTest(4);
    }
}
