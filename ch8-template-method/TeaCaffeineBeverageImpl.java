/**
 * 继承自咖啡因饮料
 */
public class TeaCaffeineBeverageImpl extends CaffeineBeverage {

    /**
     * 需要定义增加调料
     */
    @Override
    void addCondiments() {
        System.out.println("Steeping the tea");
    }

    /**
     * 需要定义处理方法
     */
    @Override
    void brew() {
        System.out.println("Adding Lemon");
    }
}
