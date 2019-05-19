package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 20:01
 */
public class LuxuryFactory implements CarFactory {
    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }
}
