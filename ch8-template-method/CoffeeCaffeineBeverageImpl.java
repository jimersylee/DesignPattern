/**
 * 继承自咖啡因饮料
 */
public class CoffeeCaffeineBeverageImpl extends CaffeineBeverage {
    /**
     * 需要定义增加什么调料
     */
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * 咖啡需要定义处理方法
     */
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
