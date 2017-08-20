package Beverge;

/**
 * 普通的HouseBlend咖啡
 * Created by jimersylee on 17-8-19.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
