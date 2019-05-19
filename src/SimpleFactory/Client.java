package SimpleFactory;

/**
 * @author summer
 * @date 2019-05-19 19:40
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Operation add = SimpleFactory.createOperation("+");
        Operation sub = SimpleFactory.createOperation("-");
        Operation mul = SimpleFactory.createOperation("*");
        Operation div = SimpleFactory.createOperation("/");
        System.out.println(add.getResult(1,1));
        System.out.println(sub.getResult(1,1));
        System.out.println(mul.getResult(1,1));
        System.out.println(div.getResult(1,1));
    }
}
