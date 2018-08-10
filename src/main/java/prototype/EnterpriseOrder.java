package prototype;

/**
 * @author zhuhh 2018/8/9
 */
public class EnterpriseOrder implements IOrder,Cloneable {
    private String enterpriseName;
    private long orderNumber;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    @Override
    public long getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", orderNumber=" + orderNumber +
                '}';
    }

    @Override
    public Object clone() {
        Object obejct = null;
        try {
            obejct = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obejct;
    }
}
