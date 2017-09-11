/**
 * 遥控器使用测试,这是命令模式的客户
 */
public class RemoteControlTest {
    public static void main(String[] args){
        //遥控器就是调用者,会传入一个命令对象,可以用来发出请求
        SimpleRemoteControl remoteControl=new SimpleRemoteControl();
        //创建了一个电灯对象,此对象也就是请求的接收者
        Light light=new Light();
        //这里创建一个命令,然后将接收者传给它
        LightOnCommand lightOnCommand=new LightOnCommand(light);
        //设置命令
        remoteControl.setCommand(lightOnCommand);
        //调用命令
        remoteControl.buttonWasPressed();
    }


}
