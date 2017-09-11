package Beverge;

/**
 * Whip.奶泡.一种调味方式,扩展自调味类
 * 名字 Whip,价格0.5
 * Created by jimersylee on 17-8-19.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.5;
    }
}
