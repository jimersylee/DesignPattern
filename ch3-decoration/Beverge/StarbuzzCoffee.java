package Beverge;

/**
 * 饮料店测试类
 * Created by jimersylee on 17-8-19.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        //订一杯咖啡,不要调料
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        //订一杯深度烘焙咖啡,双份摩卡,奶泡
        Beverage beverage1=new DarkRoast();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
    }
}
