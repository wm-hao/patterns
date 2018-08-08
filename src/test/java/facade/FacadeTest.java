package facade;

import org.junit.Test;

/**
 * @author zhuhh 2018/8/8
 */
public class FacadeTest {

    @Test
    public void test() {
        FacadeFacotry.createFacade().generateCode();
    }
}
