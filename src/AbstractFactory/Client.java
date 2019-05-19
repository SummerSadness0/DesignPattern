package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 20:03
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
        Tyre t = factory.createTyre();
        t.revolve();
    }
}
