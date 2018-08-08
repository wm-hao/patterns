package singleton;

/**
 * @author zhuhh 2018/8/7
 */
public class Singleton {

    /**
     * 基础版 直接new实例 存在浪费资源问题
     */
    private static Singleton singleton = new Singleton();

    /**
     *  构造方法私有
     */
    private Singleton() {

    }

    /**
     * 懒汉模式 jdk5 之后版本采用volatile是安全
     */
    private volatile static Singleton lazySingleton = null;

    /**
     * 懒汉版本 线程安全
     * @return
     */
    public static Singleton createSingletonLazyByDoudleNullCheck() {
        if(null == lazySingleton) {
            synchronized (Singleton.class) {
                if(null == lazySingleton) {
                    lazySingleton = new Singleton();
                }
            }
        }
        return lazySingleton;
    }

    private static class SingleHolder {
        private static Singleton singleton = new Singleton();
    }

    /**
     * 懒汉版本 线程安全 内部类方式
     * @return
     */
    public static Singleton createSingletonLazyByInnerStaticClass() {
        return SingleHolder.singleton;
    }

    /**
     * 饿汉版本 线程安全
     */
    public static Singleton createSingletonUrge() {
        return singleton;
    }

}
