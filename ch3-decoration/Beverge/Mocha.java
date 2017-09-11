package Beverge;

/**
 * 摩卡一种调味方式,扩展自调味类
 * Created by jimersylee on 17-8-19.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }


}
