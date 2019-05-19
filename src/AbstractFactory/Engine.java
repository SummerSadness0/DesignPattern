package AbstractFactory;

/**
 * @author summer
 * @date 2019-05-19 19:59
 */
public interface Engine {
    void run();
    void start();
}
class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("快");
    }

    @Override
    public void start() {
        System.out.println("快");
    }
}

class CheapEngine implements Engine{

    @Override
    public void run() {
        System.out.println("慢");
    }

    @Override
    public void start() {
        System.out.println("慢");
    }
}
