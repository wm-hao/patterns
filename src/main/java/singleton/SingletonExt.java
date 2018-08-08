package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author John
 * @date 2018/8/8
 */
public class SingletonExt {
    private final static String DEFAULT_KEY = "Cache";

    private static Map<String, SingletonExt> map = new HashMap<>();

    private static int num = 1;

    private final static int MAX_NUM = 3;

    private SingletonExt() {}

    public static SingletonExt getInstance() {
        String key = DEFAULT_KEY + num;
        if(!map.containsKey(key)) {
            SingletonExt singletonExt = new SingletonExt();
            map.put(key, singletonExt);
        }
        num++;
        if(num > MAX_NUM) {
            num = 1;
        }
        return map.get(key);
    }
}
