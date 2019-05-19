package builder;

/**
 * @author summer
 * @date 2019-05-19 15:04
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
