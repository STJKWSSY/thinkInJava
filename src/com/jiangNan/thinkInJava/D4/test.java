package com.jiangNan.thinkInJava.D4;

import java.util.Random;

/**
 * @class: test
 * @description: 控制执行流程练习题
 * @author:grolia
 * @date: 2019-07-28 22:39
 */
public class test {

    /**
     * 练习6 修改前面2个程序中的test,判断是否在其范围内 p69
     * @param begin  开始数字
     * @param end    结束数字
     * @param target  目标
     * @param testVal 测试值
     */

     public static void test6(int testVal,int target,int begin,int end ){
         if((begin <= testVal) && (testVal <= end)){
             System.out.println("测试数字包含在范围内");
         }
         if(testVal < target){
             System.out.println("小于目标");
         }else if(testVal > target){
             System.out.println("大于目标");
         } else{
             System.out.println("等于哦");
         }
     }

    /**
     * 练习7 采用不同的方式退出循环 p70
     * @param flag 标志
     */
    public static void test7(int flag){
        for (int i = 1; i < 100; i++) {
            if(i == 99){
                if(flag == 1){
                    System.out.println("通过break退出的哦");
                    break;
                }else{
                    System.out.println("通过return退出的哦");
                    return;
                }
            }
        }
     }

    /**
     * 练习8 switch p75
     *
     */
    public static void test8(){
        for (int i = 0; i < 10; i++) {
            switch (i){
                case 1:
                    //如果没有break，每一次都会命中default
                    System.out.println("这会苹果我爱吃"); break;
                case 2:
                    System.out.println("这会香蕉");break;
                case 3:
                    System.out.println("这会猕猴桃");break;
                case 4:
                    System.out.println("这会菠萝"); break;
                default:
                    System.out.println("这会水果，吃就没错了嘻嘻");  break;
            }
        }
    }

    /**
     * test9 size个斐波那契数列 p75
     * @param size  结尾
     *
     */
    public  static void test9(int size){
        int i = 1;
        int j = 1;
        int sum = 0;
        String str = "";
        for(int z = 1;z<=size-2;z++){
            sum = i + j;
            str += "," + sum;
            i = j ;
            j = sum;
        }
        System.out.println("斐波那契数列是 = 1,1" + str);
    }

    /**
     * vampireNumber 吸血鬼数字 p75
     */
    public  static void test10(){
        int first,second;
        String str = "吸血鬼数字有";
        for (int i = 10; i < 99; i++) {
            for (int j = 10; j < 99; j++) {
                if((j * i <1000) || (j * i >9999)){
                    continue;
                }
                int sum = i * j;
                String sumStr = sum+"";
                if((sumStr).contains(i%10+"")){
                    sumStr = sumStr.replace(i%10+"","");
                    if((sumStr).contains(i/10+"")){
                        sumStr = sumStr.replace(i/10+"","");
                       if((sumStr).contains(j%10+"")){
                           sumStr = sumStr.replace(j%10+"","");
                           if((sumStr).contains(j/10+"")){
                               System.out.println("sum = " + sum + "i =" + i + "j = " + j);
                           }
                       }
                    }
                }
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        test10();
    }



}
