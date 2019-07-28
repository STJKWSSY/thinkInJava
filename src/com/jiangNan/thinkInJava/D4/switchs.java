package com.jiangNan.thinkInJava.D4;

import java.util.Random;

/**
 * @class: switchs
 * @description: jjavaSwitch
 * @author:grolia
 * @date: 2019-07-28 23:00
 */
public class switchs {

    /**
     * java中的switch
     * @param flag 标志
     */
    public static void switchMethod(int flag){
        /*
         switch的选择因子必须是int或者是char或者是enum那样的整数值
         每一个case都会以break结尾，末尾会有一个default，在default会添加break
         */
        switch (flag){
            case 1:
                System.out.println("这是苹果我爱吃"); break;
            case 2:
                System.out.println("这是香蕉");break;
            case 3:
                System.out.println("这是猕猴桃");break;
            case 4:
                System.out.println("这是菠萝"); break;
            default:
                System.out.println("这是水果，吃就没错了嘻嘻");  break;
        }
    }

    public static void main(String[] args) {
        switchMethod(new Random().nextInt(5));
    }
}
