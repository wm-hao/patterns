package singleton;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh
 */
public class SingletonTest {

    private static Logger logger = LoggerFactory.getLogger(SingletonTest.class);


    @Test
    public void testCreateSingletonLazy() {
        logger.info(Singleton.createSingletonLazy().toString());
        logger.info(Singleton.createSingletonLazy().toString());
    }

    @Test
    public void testCreateSingletonUrge() {
        logger.info(Singleton.createSingletonUrge().toString());
        logger.info(Singleton.createSingletonUrge().toString());
    }

}