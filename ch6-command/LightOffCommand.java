/**
 * 开电灯命令,这是一个命令,所以需要实现Command接口
 */
public class LightOffCommand implements Command {
    Light light;

    /**
     * execute方法调用接收对象的on()方法
     */
    @Override
    public void execute() {
        light.off();
    }

    /**
     * 构造器传入了某个灯泡,以便让这个命令控制,一旦调用execute(),就由这个对象成为接收者,负责接受请求
     * @param light
     */
    public LightOffCommand(Light light){
        this.light=light;
    }
}
