/**
 * 绿头鸭类
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();//绿头鸭使用Quack类处理叫,所以当performQuack()被调用时,叫的职责被委托给Quack
        flyBehavior=new FlyWithWings();//同理
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
