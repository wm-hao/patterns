package proxy;

/**
 * @author zhuhh 2018/8/9
 */
public interface OrderApi {
    int getOrderNumber();

    void setOrderNumber(int orderNumber, String user);
}
