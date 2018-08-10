package prototype;

/**
 * @author zhuhh 2018/8/9
 */
public class PersonalOrder implements IOrder,Cloneable {

    private long orderNumber;
    private String custName;


    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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
        return super.toString() + "PersonalOrder{" +
                "orderNumber=" + orderNumber +
                ", custName='" + custName + '\'' +
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
