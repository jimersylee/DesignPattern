/**
 *
 */
public abstract  class Duck{
    private String _headColor="yellow";//Duck对象必备的属性

    public String get_headColor() {
        return _headColor;
    }

    public void set_headColor(String _headColor) {
        this._headColor = _headColor;
    }

    public IFlyBehavior flyBehavior;//为行为接口类型声明引用变量,所有鸭子子类都继承他们

    public IFlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public IQuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public IQuackBehavior quackBehavior;//同上


    public Duck(){

    }

    public void performQuack(){
        quackBehavior.quack();//委托给行为类
    }

    public void performFly(){
        flyBehavior.fly();//委托给行为类
    }

    public abstract void display();

    /**
     * Duck必备的行为
     */
    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }

}