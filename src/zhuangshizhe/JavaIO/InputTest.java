package zhuangshizhe.JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-15
 * Time: 19:39
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try{
            InputStream in = new UpperToCastInputStream(new BufferedInputStream(new FileInputStream("E:\\IdeaProjects\\design\\src\\zhuangshizhe\\JavaIO\\text")));
            while((c=in.read())>=0){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
