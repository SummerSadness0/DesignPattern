package Observer;
import java.util.ArrayList;
import java.util.List;
/**
 * @author summer
 * @date 2019-05-19 20:06
 */
public class Subject {
    protected List<Observer> list = new ArrayList<>();
    public void registerObserver(Observer obs){
        list.add(obs);
    }
    public void removeObserver(Observer obs){
        list.remove(obs);
    }
    public void notifyAllObservers(){
        for(Observer obs : list){
            obs.update(this);
        }
    }
}

class ConcreteSubject extends Subject{
    private int state;
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        //目标对象值发生了变化，请通知所有观察者
        this.notifyAllObservers();
    }
}