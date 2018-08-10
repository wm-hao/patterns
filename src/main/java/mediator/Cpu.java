package mediator;

/**
 * @author zhuhh 2018/8/9
 */
public class Cpu extends AbstractColleague{

    private String videoData;
    private String soundData;

    public Cpu(IMediator mediator) {
        super(mediator);
    }

    public String getVideoData() {
        return videoData;
    }

    public void setVideoData(String videoData) {
        this.videoData = videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    public void setSoundData(String soundData) {
        this.soundData = soundData;
    }

    public void excuteData(String data) {
        String[] datas = data.split(",");
        videoData = datas[0];
        soundData = datas[1];
        System.out.println("CPU成功解析数据");
        this.getMediator().change(this);
    }
}
