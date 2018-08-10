package proxy;

/**
 * @author zhuhh 2018/8/9
 */
public class Order implements OrderApi{

    private String orderName;
    private int orderNumber;


    public Order() {

    }
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void setOrderNumber(int orderNumber, String user) {
        this.orderNumber = orderNumber;
    }
}
