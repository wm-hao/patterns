package facade.impl;

import facade.interfaces.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh 2018/8/8
 */
public class ServiceImpl implements IService {

    private static Logger logger = LoggerFactory.getLogger(ServiceImpl.class);

    @Override
    public void generateService() {
        logger.info("系统生成service代码");
    }

    @Override
    public void s() {
        System.out.println("提供给外围的service");
    }
}
