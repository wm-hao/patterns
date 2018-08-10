package mediator;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * @author zhuhh 2018/8/9
 */
public class MotherBoard implements IMediator {

    private Cpu cpu;

    private DVD dvd;

    private VideoCard videoCard;

    private SoundCard soundCard;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public DVD getDvd() {
        return dvd;
    }

    public void setDvd(DVD dvd) {
        this.dvd = dvd;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    @Override
    public void change(AbstractColleague colleague) {
        if (colleague == dvd) {
            openDVD((DVD) colleague);
        } else if (colleague == cpu) {
            openCPU((Cpu) colleague);
        }
    }


    private void openDVD(DVD dvd) {
        String data = dvd.getData();
        cpu.excuteData(data);
    }

    private void openCPU(Cpu cpu) {
        String video = cpu.getVideoData();
        String sound = cpu.getSoundData();
        soundCard.playSound(sound);
        videoCard.playVideo(video);
    }


}
