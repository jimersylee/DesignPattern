/**
 * 高级遥控器
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands=new Command[7];
        offCommands =new Command[7];
        Command noCommand=new  ;
        for(int i=0;i<7;i++){
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }

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
