/**
 * 巧克力工厂,非单例
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    /**
     * 代码开始时,锅炉是空的
     */
    public ChocolateBoiler(){
        empty=true;
        boiled=false;
    }

    /**
     * 在锅炉内填入原料时,锅炉必须是空的.一旦填入原料,就把empty和boiled标识设置好.
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //将炉内物煮沸
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
