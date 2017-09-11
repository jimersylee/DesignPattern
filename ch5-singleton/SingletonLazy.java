/**
 * 单例模式之懒汉模式
 * 优点:在需要实例的时候才进行第一次实例化,在资源紧缺的时候,可以减少不必要的资源消耗
 * 缺点:同步了getInstance(),会造成性能浪费
 */
public class SingletonLazy {
    /**
     * 利用一个静态变量来记录Singleton类的唯一实例
     */
    private static SingletonLazy instance;

    /**
     * 构造器声明为私有的,只有自己Singleton类才可以调用构造器
     */
    private SingletonLazy() {

    }

    /**
     * 用getInstance()实例化对象,并返回这个实例
     * 在多线程中必须使用synchronized关键字修饰
     * @return
     */
    public static synchronized SingletonLazy getInstance() {

        //懒汉模式
        //如果未被实例化,则new
        if (instance == null) {
            instance = new SingletonLazy();
        }
        //如果已经实例化,则返回实例
        return instance;
    }
}
