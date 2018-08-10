package observer;

import org.junit.Test;

/**
 * @author zhuhh 2018/8/9
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        NewsPaper newsPaper = new NewsPaper();
        Reader reader1 = new Reader("reader1");
        Reader reader2 = new Reader("reader2");
        Reader reader3 = new Reader("reader3");

        newsPaper.addObserver(reader1);
        newsPaper.addObserver(reader2);
        newsPaper.addObserver(reader3);

        System.out.println("读者数量：" + newsPaper.countObservers());
        newsPaper.setContent();

    }
}
