package builder;

/**
 * @author summer
 * @date 2019-05-19 15:18
 */
public class summerAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public summerAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }


    @java.lang.Override
    public AirShip directAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower s = builder.builderEscapeTower();
        AirShip ship = new AirShip();
        ship.setEngine(e);
       ship.setEscapeTower(s);
       ship.setOrbitalModule(o);

        return ship;
    }
}
