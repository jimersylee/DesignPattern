/**
 * 巧克力工厂,单例模式
 */
public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSingleton instance;

    /**
     * 代码开始时,锅炉是空的
     */
    private ChocolateBoilerSingleton(){
        empty=true;
        boiled=false;
    }


    public static synchronized ChocolateBoilerSingleton getInstance(){
        if(instance==null){
            instance=new ChocolateBoilerSingleton();
        }

        return instance;
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
