package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 20:02
 */
public interface CarFactory {
    Tyre createTyre();
    Seat createSeat();
    Engine createEngine();
}
