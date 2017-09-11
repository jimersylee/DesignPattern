package Beverge;

/**
 * 深度烘焙咖啡
 * Created by jimersylee on 17-8-19.
 */
public class DarkRoast extends Beverage {

    public String getDescription(){
        return "DarkRoast";
    }
    @Override
    public double cost() {
        return 1.2;
    }
}
