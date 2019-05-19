package FactoryMethod;

/**
 * @author summer
 * @date 2019-05-19 19:48
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Factory addFactory = new AddFactory();
        Factory subFactory = new SubFactory();
        Factory mulFactory = new MulFactory();
        Factory divFactory = new DivFactory();

        Operation add = addFactory .createOperation();
        Operation sub = subFactory .createOperation();
        Operation mul = mulFactory .createOperation();
        Operation div = divFactory .createOperation();
        System.out.println(add.getResult(1,1));
        System.out.println(sub.getResult(1,1));
        System.out.println(mul.getResult(1,1));
        System.out.println(div.getResult(1,1));
    }
}
