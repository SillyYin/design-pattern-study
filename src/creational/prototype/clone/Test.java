package creational.prototype.clone;

import java.util.Date;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("pig1", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println(pig1 == pig2);

        birthday.setTime(77777777777L);
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println(pig1 == pig2);
    }
}
