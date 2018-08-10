package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhuhh 2018/8/9
 */
public class OrderProxy implements InvocationHandler {

    private OrderApi realOrder;

    public OrderProxy(Order order) {
        this.realOrder = order;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("setOrderNumber")) {
            if(!args[1].equals("admin")) {
                throw new Exception("你没有权限更改订单数量！");
            }
        }
        return method.invoke(realOrder, args);
    }

    public OrderApi getProxy() {
        OrderApi order = (OrderApi) Proxy.newProxyInstance(realOrder.getClass().getClassLoader(), realOrder.getClass().getInterfaces(), this);
        return order;
    }
}
