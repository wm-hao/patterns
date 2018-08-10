package mediator;

/**
 * @author zhuhh 2018/8/9
 */
public class VideoCard extends AbstractColleague {
    public VideoCard(IMediator mediator) {
        super(mediator);
    }

    public void playVideo(String video) {
        System.out.println("显卡播放：" + video);
    }
}
