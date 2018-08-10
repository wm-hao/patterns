package proxy;

import org.junit.Test;

/**
 * @author zhuhh 2018/8/9
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        Order order = new Order();
        order.setOrderName("大订单");
        order.setOrderNumber(100, "");
        OrderProxy proxy = new OrderProxy(order);
        OrderApi proxyOrder = proxy.getProxy();
        proxyOrder.setOrderNumber(200, "admin2");
        System.out.println(proxyOrder.getOrderNumber());
    }
}
