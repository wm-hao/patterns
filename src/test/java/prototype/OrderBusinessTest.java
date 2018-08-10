package prototype;

import org.junit.Test;

public class OrderBusinessTest {

    @Test
    public void testClone() {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setCustName("john");
        personalOrder.setOrderNumber(1000);
        System.out.println(personalOrder);
        PersonalOrder personalOrder1 = (PersonalOrder) personalOrder.clone();
        personalOrder1.setCustName("john1");
        System.out.println(personalOrder1);
    }

    @Test
    public void testProptypeManager() throws Exception {
        Proptype proptype1 = new ConcreteProptype1();
        proptype1.setName("john1");
        ProptypeManager.registProptype("1", proptype1);
        System.out.println(ProptypeManager.getProptype("1"));
        ProptypeManager.unregistProptype("2");
        System.out.println(ProptypeManager.getProptype("1"));

    }
}