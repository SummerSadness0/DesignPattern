package builder;
/**
 * @author summer
 * @date 2019-05-19 14:44
 */
public class AirShip {
    private OrbitalModule orbitalModule; //轨道舱
    private Engine engine;
    private EscapeTower escapeTower;

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public AirShip setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public AirShip setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public AirShip setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
        return this;
    }
}
class OrbitalModule{
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public OrbitalModule setName(String name) {
        this.name = name;
        return this;
    }
}
class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Engine setName(String name) {
        this.name = name;
        return this;
    }
}
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public EscapeTower setName(String name) {
        this.name = name;
        return this;
    }
}








