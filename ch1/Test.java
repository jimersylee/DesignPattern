public class Test {
    public static void main(String args[]){
        MallardDuck mallardDuck=new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();


        //搞一只模型鸭
        ModelDuck md=new ModelDuck();
        md.performFly();//第一次调用飞行时,委托给FlyNoWay
        md.setFlyBehavior(new FlyWithRocket());//继承来的设置飞行模式的方法,给予火箭动力
        md.performFly();//现在能飞啦~

    }
}
