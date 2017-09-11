package IO;

import java.io.*;

/**
 * 新的I/O装饰者测试类,用来测试将输入转换为小写
 * Created by jimersylee on 17-8-20.
 */
public class InputTest {

    public static void main(String[] args){
        int c;
        try {
            //设置FileInputStream
            //先用BufferedInputStream装饰
            //再用我们崭新的LowerCaseInputStream装饰
            InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/home/jimersylee/project/java/DesignPattern/ch3/IO/test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
