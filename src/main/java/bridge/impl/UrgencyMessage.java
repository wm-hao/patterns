package bridge.impl;

import bridge.interfaces.AbstractMessage;
import bridge.interfaces.IMessgaeOperation;

/**
 * @author John
 * @date 2018/8/8
 */
public class UrgencyMessage extends AbstractMessage {
    private final static String URGENCY_WORDS = "加急:";


    public UrgencyMessage(IMessgaeOperation messgaeOperation) {
        super(messgaeOperation);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        msg = URGENCY_WORDS + msg;
        super.sendMessage(msg, toUser);
    }
}
