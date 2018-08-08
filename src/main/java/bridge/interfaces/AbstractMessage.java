package bridge.interfaces;

/**
 * @author John
 * @date 2018/8/8
 */
public abstract class AbstractMessage {

    private IMessgaeOperation messgaeOperation;

    public AbstractMessage(IMessgaeOperation messgaeOperation) {
        this.messgaeOperation = messgaeOperation;
    }

    public void sendMessage(String msg, String toUser) {
        messgaeOperation.send(msg, toUser);
    }
}
