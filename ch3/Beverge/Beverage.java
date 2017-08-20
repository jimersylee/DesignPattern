package Beverge;

/**
 * 饮料抽象类
 * Created by jimersylee on 17-8-19.
 */
public abstract class Beverage {
  String description="Unknown Beverage";

  public String getDescription(){
      return description;
  }

    /**
     * 子类必须继承此计算价格的方法
     * @return
     */
  public abstract double cost();
}
