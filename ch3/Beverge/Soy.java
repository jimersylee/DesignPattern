package Beverge;

/**
 * Soy,一种调味方式,扩展调味类
 * 名字叫Soy,价格0.3
 * Created by jimersylee on 17-8-19.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.30;
    }
}
