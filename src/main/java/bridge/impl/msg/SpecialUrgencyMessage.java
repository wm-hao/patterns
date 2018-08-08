package bridge.impl.msg;

import bridge.interfaces.AbstractMessage;
import bridge.interfaces.IMessgaeOperation;

/**
 * @author zhuhh 2018/8/8
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    private final static String SPECIAL_URGENCY_WORDS = "紧急:";

    public SpecialUrgencyMessage(IMessgaeOperation messgaeOperation) {
        super(messgaeOperation);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        msg = SPECIAL_URGENCY_WORDS + msg;
        super.sendMessage(msg, toUser);
    }

    public void urge(String messageId) {

    }
}
