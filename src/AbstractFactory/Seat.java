package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 20:00
 */
public interface Seat {
    void massage();
}
class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("舒服");
    }
}
class CheapSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("难受");
    }
}