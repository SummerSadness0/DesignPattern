package TemplateMethod;

/**
 * @author summer
 * @date 2019-05-19 20:10
 */
public abstract class TemplateMethod {
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }
    //钩子方法
    public abstract void transact();
    public void evaluate(){
        System.out.println("反馈评分");
    }
    //模板方法，把基本操作组合到一起，子类一般不能重写
    public final void process(){
        this.takeNumber();
        this.transact();//像个钩子，执行时挂哪个子类的方法就执行哪个
        this.evaluate();
    }
}
