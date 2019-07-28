package com.jiangNan.thinkInJava.D4;

/**
 * @class: label
 * @description: java中的标签
 * @author:grolia
 * @date: 2019-07-28 22:50
 */
public class label {

    /**
     * java标签迭代
     *
     */
    public static void labelFor(){
      /*
      java中，标签起作用的唯一的地方就是刚好实在迭代语句前
      但是不建议使用标签
      */
      int i = 0;
//      outer;
      for(; true ;){
//          inner;
          for (int j = 0; j < 10; j++) {
              System.out.println("j = " + j);
              if(i == 2){
                  System.out.println("contiune");
                  continue;
              }
              if(i == 3){
                  System.out.println("break");
                  i++;
                  break;
              }
              if(i == 7){
                  System.out.println("contiune outer");
                  i++;
//                  continue outer;
              }
              if(i == 8){
                  System.out.println("break outer");
//                  break outer;
              }
          }
      }
     }
}
