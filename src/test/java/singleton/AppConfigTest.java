package singleton;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppConfigTest {
    private static Logger logger = LoggerFactory.getLogger(AppConfigTest.class);

    @Test
    public void testAppConfig() {
        AppConfig appConfig = new AppConfig();
        logger.info(appConfig.getParameterA() + "-" + appConfig.getParameterB());
    }


}