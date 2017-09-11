/**
 * 火鸡假装鸭子的适配器,首先,你需要实现想转换成的类型接口,也就是你的客户所期望看到的接口
 */
public class TurkeyAdapterImpl implements IDuck {
    Turkey turkey;

    /**
     * 接着,需要取得要适配的对象引用,这里我们利用构造器取得这个引用
     * @param turkey:火鸡对象
     */
    public TurkeyAdapterImpl(Turkey turkey){
        this.turkey=turkey;
    }

    /**
     * 现在我们需要实现接口中所有的方法,quack()在类之间的转换很简单,只要调用gobble()就可以了
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 虽然两个接口都具备了fly方法(),火鸡的飞行距离很短,不想鸭子可以长途飞行,要让鸭子可以长途飞行.要让鸭子的飞行和火鸡的飞行能够对应,必须连续5此调用火鸡的fly()来完成
     */
    @Override
    public void fly() {
        for(int i=0;i<5;i++){
            turkey.fly();
        }
    }
}
