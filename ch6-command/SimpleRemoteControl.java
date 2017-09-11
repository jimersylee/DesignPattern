/**
 * 普通遥控器
 */
public class SimpleRemoteControl {
    Command slot;//有一个插槽持有命令,而这个命令控制着一个装置
    public SimpleRemoteControl(){

    }

    /**
     * 这个方法用来设置插槽控制的命令.如果这段代码的客户想要改变遥控器按钮的行为,可以多次调用这个方法
     * @param command
     */
    public void setCommand(Command command){
        slot=command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
