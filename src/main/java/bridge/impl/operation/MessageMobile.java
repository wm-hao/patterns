package bridge.impl.operation;

import bridge.interfaces.IMessgaeOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh 2018/8/8
 */
public class MessageMobile implements IMessgaeOperation {
    private static Logger logger = LoggerFactory.getLogger(MessageMobile.class);

    @Override
    public void send(String msg, String toUser) {
        logger.info("通过手机短信发送消息:" + msg + "给" + toUser);
    }
}
