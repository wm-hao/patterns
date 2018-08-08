package bridge;

import bridge.impl.msg.CommonMessage;
import bridge.impl.msg.SpecialUrgencyMessage;
import bridge.impl.msg.UrgencyMessage;
import bridge.impl.operation.MessageEmail;
import bridge.impl.operation.MessageMobile;
import bridge.impl.operation.MessageSMS;
import bridge.interfaces.AbstractMessage;
import bridge.interfaces.IMessgaeOperation;
import org.junit.Test;

/**
 * @author zhuhh 2018/8/8
 */
public class BridgeTest {

    @Test
    public void testBridge() {
        IMessgaeOperation sms = new MessageSMS();
        IMessgaeOperation mobile = new MessageMobile();
        IMessgaeOperation email = new MessageEmail();

        AbstractMessage commonMsgBySms = new CommonMessage(sms);
        AbstractMessage commonMsgByMoblie = new CommonMessage(mobile);
        AbstractMessage commonMsgByEmail = new CommonMessage(email);

        String msg = "哈哈，恭喜";
        String toUser = "john";
        commonMsgByEmail.sendMessage(msg, toUser);
        commonMsgByMoblie.sendMessage(msg, toUser);
        commonMsgBySms.sendMessage(msg, toUser);

        AbstractMessage urgencyMsgBySms = new UrgencyMessage(sms);
        AbstractMessage urgencyMsgByMoblie = new UrgencyMessage(mobile);
        AbstractMessage urgencyMsgByEmail = new UrgencyMessage(email);

        urgencyMsgByEmail.sendMessage(msg, toUser);
        urgencyMsgByMoblie.sendMessage(msg, toUser);
        urgencyMsgBySms.sendMessage(msg, toUser);


        AbstractMessage specialUrgencyMsgBySms = new SpecialUrgencyMessage(sms);
        AbstractMessage specialUrgencyMsgByMoblie = new SpecialUrgencyMessage(mobile);
        AbstractMessage specialUrgencyMsgByEmail = new SpecialUrgencyMessage(email);

        specialUrgencyMsgByEmail.sendMessage(msg, toUser);
        specialUrgencyMsgByMoblie.sendMessage(msg, toUser);
        specialUrgencyMsgBySms.sendMessage(msg, toUser);
    }
}
