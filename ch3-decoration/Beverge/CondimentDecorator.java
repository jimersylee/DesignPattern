package Beverge;

/**
 * 调味料装饰者
 * Created by jimersylee on 17-8-19.
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有的调料装饰者必须重新实现getDescription方法
     * @return
     */
    public abstract String getDescription();
}
