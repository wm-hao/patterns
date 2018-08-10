package mediator;

/**
 * @author zhuhh 2018/8/9
 */
public class Client {

    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard();
        Cpu cpu = new Cpu(motherBoard);
        DVD dvd = new DVD(motherBoard);
        VideoCard videoCard = new VideoCard(motherBoard);
        SoundCard soundCard = new SoundCard(motherBoard);
        motherBoard.setCpu(cpu);
        motherBoard.setDvd(dvd);
        motherBoard.setSoundCard(soundCard);
        motherBoard.setVideoCard(videoCard);
        dvd.readDVD();
    }
}
