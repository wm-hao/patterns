package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhuhh 2018/8/9
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ":" + arg);
    }
}
