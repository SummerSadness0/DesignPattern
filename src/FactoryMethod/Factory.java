package FactoryMethod;

/**
 * @author summer
 * @date 2019-05-19 19:46
 */
public interface Factory {
    Operation createOperation();
}
class AddFactory implements Factory {

    @Override
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Add();
    }
}
class SubFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("减法运算");
        return new Sub();
    }
}
class MulFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("乘法运算");
        return new Mul();
    }
}
class DivFactory implements Factory {
    @Override
    public Operation createOperation() {
        System.out.println("除法运算");
        return new Div();
    }
}
