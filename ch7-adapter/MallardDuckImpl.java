public class MallardDuckImpl implements IDuck {
    @Override
    public void quack() {
        System.out.println("gua!gua!gua!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a long distance");
    }
}
