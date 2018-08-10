package mediator;

/**
 * @author zhuhh 2018/8/9
 */
public class DVD extends AbstractColleague{
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DVD(IMediator mediator) {
        super(mediator);
    }

    public void readDVD() {
        String data = "你好这是鸡蛋与石头的较量,当当当";
        this.setData(data);
        System.out.println("DVD成功读取数据");
        this.getMediator().change(this);
    }
}
