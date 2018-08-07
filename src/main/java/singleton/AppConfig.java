package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author zhuhh 2018/8/7
 */
public class AppConfig {

    private static Logger logger = LoggerFactory.getLogger(AppConfig.class);

    private String parameterA;
    private String parameterB;

    public String getParameterA() {
        return parameterA;
    }

    public void setParameterA(String parameterA) {
        this.parameterA = parameterA;
    }

    public String getParameterB() {
        return parameterB;
    }

    public void setParameterB(String parameterB) {
        this.parameterB = parameterB;
    }

    public AppConfig() {
        readConfig();
    }

    private void readConfig() {
        Properties prop = new Properties();
        InputStream in = null;
        try{
            in = AppConfig.class.getResourceAsStream("AppConfig.properties");
            prop.load(in);
            parameterA = prop.getProperty("parameterA");
            parameterB = prop.getProperty("parameterB");
        }catch (Exception e) {
            logger.error("加载配置文件出错");
            logger.error(e.getMessage(), e);
        }finally {
            if(null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }
    }
}
