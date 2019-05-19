package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 20:00
 */
public interface Tyre {
    void revolve();
}
class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("磨损少");
    }
}
class CheapTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("磨损多");
    }
}