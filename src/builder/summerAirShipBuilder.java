package builder;

/**
 * @author summer
 * @date 2019-05-19 15:09
 */
public class summerAirShipBuilder implements AirShipBuilder {

    @java.lang.Override
    public Engine builderEngine() {
        System.out.println("summer发动机");
        return new Engine("发动机");
    }

    @java.lang.Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("summer轨道舱");
        return new OrbitalModule("轨道舱");
    }

    @java.lang.Override
    public EscapeTower builderEscapeTower() {
        System.out.println("summer逃逸塔");
        return new EscapeTower("逃逸塔");
    }
}
