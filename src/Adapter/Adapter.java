package Adapter;

/**
 * @author summer
 * @date 2019-05-24 19:23
 */
public class Adapter extends Adpatee implements Target{
    @Override
    public void handleReq() {
        super.request();
    }
}
