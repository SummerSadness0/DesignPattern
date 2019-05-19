package SimpleFactory;

/**
 * @author summer
 * @date 2019-05-19 19:37
 */
public interface Operation {
    public double getResult(double A, double B) throws Exception;
}
class Add implements Operation {
    @Override
    public double getResult(double A, double B) throws Exception {
        return A+B;
    }
}
class Sub implements Operation {
    @Override
    public double getResult(double A, double B) throws Exception {
        return A-B;
    }
}
class Mul implements Operation {
    @Override
    public double getResult(double A, double B) throws Exception {
        return A*B;
    }
}
class Div implements Operation {
    @Override
    public double getResult(double A, double B) throws Exception {
        return A/B;
    }
}