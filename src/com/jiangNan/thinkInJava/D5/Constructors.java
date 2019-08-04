package com.jiangNan.thinkInJava.D5;

/**
 * @class: Constructors
 * @description:  构造器
 * @author:grolia
 * @date: 2019-08-04 22:28
 */
public class Constructors {

    public String consName;

    public String consValue;

    public String consSex;

    public int consAge;

    /**
     * 这是默认的构造器
     */
    public  Constructors(){

    }

    /**
     * 全参数构造器
     * @param consName 属性
     * @param consValue 属性
     * @param consSex 属性
     * @param consAge 属性
     */
    public Constructors(String consName, String consValue, String consSex, int consAge) {
        this.consName = consName;
        this.consValue = consValue;
        this.consSex = consSex;
        this.consAge = consAge;
    }

    /**
     * 半参数构造器
     * @param consSex 属性
     * @param consAge 属性
     */
    public Constructors(String consSex, int consAge) {
        this.consSex = consSex;
        this.consAge = consAge;
    }

    @Override
    public String toString() {
       String str =  "consName = " + this.consName + "consValue = " + this.consValue + "consAge = " + this.consAge + "consSex = " + this.consSex;
       return str;
    }

    /**
     * 重载方法1
     * @param consAge 属性
     * @param consName  属性
     */
    public void con1(String consName , int consAge){
        System.out.println("this is consName = " + consName + "this is consAge = " + consAge);
    }

    /**
     * 重载方法2
     * @param consAge 属性
     * @param consName  属性
     */
    public void con1(int consAge,String consName){
        System.out.println("this is consName = " + consName + "this is consAge = " + consAge);
    }

    /**
     * 重载方法3
     * @param consValue 属性
     * @param consName  属性
     */
    public void con1(String consValue,String consName){
        /*
           重载是以参数列表为唯一条件的，而参数类型的顺序可以作为辨别条件，返回值和参数名称不可以的
         */
        System.out.println("this is consValue = " + consValue + "this is consAge = " + consAge);
    }


    public static void main(String[] args) {
        // 这行创建了一个新的对象，并调用了默认的构造器----》即使你没有明确的定义它，如果你重载了构造器，java是不会自动添加默认构造期的
        Constructors constructors = new Constructors();
    }
}
