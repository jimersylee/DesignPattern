/**
 * 模板方法模式测试
 */
public class TemplateMethodTest {

    public static void main(String[] args){
        //new一个茶对象
        TeaCaffeineBeverageImpl tea=new TeaCaffeineBeverageImpl();
        tea.prepareRecipe();
    }
}
