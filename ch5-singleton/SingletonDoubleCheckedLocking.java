/**
 * 单例模式之使用"双重检查加锁"
 * 过程:在getInstance()中进行双重检查,确保一个实例
 * 优点:在getInstance()中减少同步,增强性能,可以在多线程中使用
 * 缺点:暂无
 */
public class SingletonDoubleCheckedLocking {
    /**
     * 利用一个静态变量来记录Singleton类的唯一实例
     * volatile关键字确保:当instance变量被初始化为Singleton实例时,多个线程正确地处理instance变量
     */
    private static volatile SingletonDoubleCheckedLocking instance;

    /**
     * 构造器声明为私有的,只有自己Singleton类才可以调用构造器
     */
    private SingletonDoubleCheckedLocking() {
    }

    /**
     * 用getInstance()实例化对象,并返回这个实例
     * 方法不必用synchronized关键字修饰
     * @return
     */
    public static SingletonDoubleCheckedLocking getInstance() {
        if(instance==null){//检查实例,如果不存在,则进入同步区块
            //注意:只有第一次调用getInstance()方法才彻底执行这里的代码
            synchronized (SingletonDoubleCheckedLocking.class){
                if(instance==null){//进入区块后,再检查一次,如果是null,才创建实例
                    instance=new SingletonDoubleCheckedLocking();
                }
            }
        }

        return instance;
    }
}
