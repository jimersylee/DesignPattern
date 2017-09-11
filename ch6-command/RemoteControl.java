/**
 * 高级遥控器
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands=new Command[7];
        offCommands =new Command[7];
        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }

    }

    /**
     * 这个方法用来设置插槽控制的命令.如果这段代码的客户想要改变遥控器按钮的行为,可以多次调用这个方法
     * @param
     */
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
}
