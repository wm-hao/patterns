package singleton;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh
 */
public class SingletonTest {

    private static Logger logger = LoggerFactory.getLogger(SingletonTest.class);
    private static int TEST_NUMBER = 10;

    @Test
    public void testCreateSingletonLazyByDoubleNullCheck() {
        for(int i=0; i<TEST_NUMBER; i++) {
            logger.info(Singleton.createSingletonLazyByDoudleNullCheck().toString());
        }
    }

    @Test
    public void testCreateSingletonUrge() {
        for(int i=0; i<TEST_NUMBER; i++) {
            logger.info(Singleton.createSingletonUrge().toString());
        }
    }

    @Test
    public void testCreateSingletonLazyByInnerStaticClass() {
        for(int i=0; i<TEST_NUMBER; i++) {
            logger.info(Singleton.createSingletonLazyByInnerStaticClass().toString());
        }
    }

    @Test
    public void getInstanceByMultiTimes() {
        for(int i=0; i<TEST_NUMBER; i++) {
            logger.info(SingletonExt.getInstance().toString());
        }
    }

}