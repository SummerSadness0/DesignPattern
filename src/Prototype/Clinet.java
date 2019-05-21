package Prototype;

import java.util.Date;

/**
 * @author summer
 * @date 2019-05-21 17:04
 */
public class Clinet {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep s1 = new Sheep("summer",new Date(123123L));
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }


}
