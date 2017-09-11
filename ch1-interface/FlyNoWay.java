/**
 * 这是飞行行为的实现,给不会飞的鸭子用
 */
public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
