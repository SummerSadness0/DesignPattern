package builder;

/**
 * @author summer
 * @date 2019-05-19 16:12
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new summerAirShipDirector(new summerAirShipBuilder());
        AirShip ship = director.directAirShip() ;
        System.out.println(ship.getEngine().getName());
    }
}
