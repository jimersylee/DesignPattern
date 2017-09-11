/**
 * 单例模式之饿汉模式
 * 过程:在程序启动的时候,静态初始化器中创建单例
 * 优点:如果程序对获取实例要求延迟低,则使用此模式,可以在多线程中使用\
 * 缺点:程序初始化的时候,会减慢速度
 */
public class SingletonEagerly {
    /**
     * 利用一个静态变量来记录Singleton类的唯一实例
     * 在静态初始化器(static initialize)中创建单例.这段代码保证了线程安全(Thread Safe)
     */
    private static SingletonEagerly instance=new SingletonEagerly();

    /**
     * 构造器声明为私有的,只有自己Singleton类才可以调用构造器
     */
    private SingletonEagerly() {
    }

    /**
     * 用getInstance()实例化对象,并返回这个实例
     * 方法不必用synchronized关键字修饰
     * @return
     */
    public static SingletonEagerly getInstance() {
        return instance;
    }
}
