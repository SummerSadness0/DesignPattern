package Prototype;

import java.util.Date;

/**
 * @author summer
 * @date 2019-05-21 16:58
 */
public class Sheep implements Cloneable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//直接调用object对象的克隆方法
        return obj;
    }

    public String getSname() {
        return sname;
    }

    public Sheep setSname(String sname) {
        this.sname = sname;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Sheep setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }
}
