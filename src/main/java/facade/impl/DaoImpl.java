package facade.impl;

import facade.interfaces.IDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh 2018/8/8
 */
public class DaoImpl implements IDao {
    private static Logger logger = LoggerFactory.getLogger(DaoImpl.class);

    @Override
    public void generateDao() {
        logger.info("系统生成dao代码");
    }

    @Override
    public void d() {
        System.out.println("提供给外围的dao");
    }
}
