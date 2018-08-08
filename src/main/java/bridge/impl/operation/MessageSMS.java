package bridge.impl.operation;

import bridge.interfaces.IMessgaeOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhuhh 2018/8/8
 */
public class MessageSMS implements IMessgaeOperation {
    private static Logger logger = LoggerFactory.getLogger(MessageSMS.class);

    @Override
    public void send(String msg, String toUser) {
        logger.info("通过站内信发送消息:" + msg + "给" + toUser);
    }
}
