package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 20:01
 */
public class CheapFactory implements CarFactory {

    @Override
    public Tyre createTyre() {
        return new CheapTyre();
    }

    @Override
    public Seat createSeat() {
        return new CheapSeat();
    }

    @Override
    public Engine createEngine() {
        return new CheapEngine();
    }
}

