package mediator;

/**
 * @author zhuhh 2018/8/9
 */
public class SoundCard extends AbstractColleague {
    public SoundCard(IMediator mediator) {
        super(mediator);
    }

    public void playSound(String sound) {
        System.out.println("声卡播放：" + sound);
    }
}
