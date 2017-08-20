package Beverge;

/**
 * 具体的浓缩咖啡
 * Created by jimersylee on 17-8-19.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description="Espresso";//description变量继承自Beverage
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
