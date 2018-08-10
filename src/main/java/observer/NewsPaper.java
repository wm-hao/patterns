package observer;

import java.util.Observable;

/**
 * @author zhuhh 2018/8/9
 */
public class NewsPaper extends Observable {

    private String news;


    public void setContent() {
        this.setChanged();
        this.notifyObservers("哈哈，你个傻瓜");
    }

}
