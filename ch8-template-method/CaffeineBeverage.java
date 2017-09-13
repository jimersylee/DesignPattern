/**
 * 咖啡因饮料是一个抽象类
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 因为咖啡和茶处理这些方法的做法不同,所以这两个方法必须被声明为抽象,剩余的东西留给子类去操心
     */
    abstract void addCondiments();

    /**
     * 因为咖啡和茶处理这些方法的做法不同,所以这两个方法必须被声明为抽象,剩余的东西留给子类去操心
     */
    abstract void brew();

    void pourInCup() {
        System.out.println("pourInCup");
    }

    void boilWater() {
        System.out.println("boilWater");
    }
}
