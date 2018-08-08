package bridge.impl;

import bridge.interfaces.AbstractMessage;
import bridge.interfaces.IMessgaeOperation;

/**
 * @author John
 * @date 2018/8/8
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(IMessgaeOperation messgaeOperation) {
        super(messgaeOperation);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        super.sendMessage(msg, toUser);
    }
}
