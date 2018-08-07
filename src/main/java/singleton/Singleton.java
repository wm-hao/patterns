package singleton;

/**
 * @author zhuhh 2018/8/7
 */
public class Singleton {

    /**
     * 基础版 直接new实例 存在浪费资源问题
     */
    private static Singleton singleton = new Singleton();

    //构造方法私有
    private Singleton() {

    }

    private static Singleton advancedSingleton = null;

    /**
     * 懒汉版本
     * @return
     */
    public static Singleton createSingletonLazy() {
        if(null == advancedSingleton) {
            synchronized (Singleton.class) {
                if(null == advancedSingleton) {
                    advancedSingleton = new Singleton();
                }
            }
        }
        return advancedSingleton;
    }

    /**
     * 饿汉版本
     */
    public static Singleton createSingletonUrge() {
        return singleton;
    }

}
