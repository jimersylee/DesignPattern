/**
 * 测试适配器
 */
public class DuckTestDrive {
    public static void main(String[] args){
        //先创建一只鸭子
        MallardDuckImpl duck=new MallardDuckImpl();
        //创建一只火鸡
        WildTurkey turkey=new WildTurkey();
        //然后将火鸡包装进一个火鸡适配器中,使它看起来想一直鸭子
        IDuck turkeyAdapter=new TurkeyAdapterImpl(turkey);

        //测试火鸡
        turkey.gobble();
        turkey.fly();

        //测试真正的鸭子
        duck.quack();
        duck.fly();

        //测试假装是鸭子的火鸡
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}
