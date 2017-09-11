/**
 * 鸭子叫的沉默实现,给不会叫的鸭子用
 */
public class QuackMute implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
