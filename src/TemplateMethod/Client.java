package TemplateMethod;

/**
 * @author summer
 * @date 2019-05-19 20:10
 */
public class Client {
    public static void main(String[] args) {
        //匿名内部类
        TemplateMethod tm = new TemplateMethod(){
            @Override
            public void transact(){
                System.out.println("取钱");
            }
        };
        tm.process();
    }
}
