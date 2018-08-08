package facade.impl;

import facade.interfaces.IController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh 2018/8/8
 */
public class ControllerImpl implements IController {
    private static Logger logger = LoggerFactory.getLogger(ControllerImpl.class);

    @Override
    public void generateControllerCode() {
        logger.info("系统生成controller代码");
    }

    @Override
    public void c() {
        System.out.println("提供给外围的controller");
    }
}
