/**
 * 公告板实现
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 构造器需要weatherData对象(也就是主题)作为注册之用
     * @param weatherData:天气对象
     */
    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * display()方法就只是把最近的问的和湿度显示出来
     */
    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degree and "+humidity+"% humidity");
    }

    /**
     * 当update被调用时,我们把温度和湿度保存起来,然后调用display
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
            this.temperature=temp;
            this.humidity=humidity;
            display();
    }
}
