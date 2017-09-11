/**
 * 简单工厂
 * 披萨工厂类
 */
public class SimplePizzaFactory {
    /**
     * 首先,在这个工厂类定义一个createPizza()方法,所有客户使用这个方法来实例化对象
     * @param type:披萨类型
     * @return Pizza
     */
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza=new Pepperoni();
        }

        return pizza;
    }
}
