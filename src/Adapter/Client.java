package Adapter;

/**
 * @author summer
 * @date 2019-05-24 19:31
 */
public class Client {
    public void test1(Target t){
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adpatee a = new Adpatee();
        Target t = new Adapter();
        c.test1(t);
    }
}
