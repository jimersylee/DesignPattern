/**
 * 披萨店类
 */
public class PizzaStore {
    /**
     * 为PizzaStore加上一个对SimplePizzaFactory的引用
     */
    SimplePizzaFactory factory;

    /**
     * 构造器需要一个工厂作为一个参数
     * @param factory
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza=this.factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
