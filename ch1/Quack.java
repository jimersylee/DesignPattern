/**
 * 叫的实现,给会呱呱叫的鸭子用
 */
public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack,gua gua gua!");
    }
}
