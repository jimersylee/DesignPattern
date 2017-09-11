public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior=new FlyNoWay();//一开始,模型鸭不会飞
        quackBehavior=new Quack();//一开始,模型鸭会呱呱叫
    }
    @Override
    public void display() {

    }
}
