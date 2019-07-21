package com.jiangNan.thinkInJava.D2;

/**
 *  方法，参数和返回值
 * @author grolia
 * @date 2019/7/21
 *
 */
public class  Method{
    /*
      方法的组成包括:名称，参数，返回值和方法体，参数列表会给出了要传给方法的信息的类型和名称。
      参数列表和和方法名（方法签名）唯一标识出方法，且返回值必须和接受的类兼容
     */


    public static void main(String[] args) {
             method(1);
             method("string");
    }

    /**
     * 入参数是String，出参是int
     *
     * @param value
     * @return int
     */
     public static int  method(String value){
         System.out.println("入参是string类型");
         return 1;
     }

    /**
     * 入参是int，出参是int
     *
     * @param value 入参是int
     * @return int
     */
     public static int method(int value){
         System.out.println("入参是int类型");
         return 2;
     }

}
