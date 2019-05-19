package Observer;

/**
 * @author summer
 * @date 2019-05-19 20:05
 */
public interface Observer {
    void update(Subject subject);
}

class ObserverA implements Observer{
    private int myState;
    @Override
    public void update(Subject subject){
        myState = ((ConcreteSubject)subject).getState();
    }
    public int getMyState(){
        return myState;
    }
    public void setMyState(int myState){
        myState = this.myState;
    }
}