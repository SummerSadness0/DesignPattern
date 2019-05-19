package SimpleFactory;

/**
 * @author summer
 * @date 2019-05-19 19:39
 */
public class SimpleFactory {
    public static Operation createOperation(String name){
        Operation obj = null;
        switch(name){
            case "+":
                obj = new Add();
                break;
            case "-":
                obj = new Sub();
                break;
            case "*":
                obj = new Mul();
                break;
            case "/":
                obj = new Div();
                break;
        }
        return obj;
    }
}
