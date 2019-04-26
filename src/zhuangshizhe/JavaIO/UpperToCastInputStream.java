package zhuangshizhe.JavaIO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-15
 * Time: 19:34
 */
public class UpperToCastInputStream extends FilterInputStream {
    //在FilterInputStream中一定有一个InputStream的对象
    public UpperToCastInputStream(InputStream inputStream){
        super(inputStream);
    }
    public int read() throws IOException{
        int c = super.read();
        return c== -1?c:Character.toUpperCase((char)c);
    }
    public int read(byte[] b, int offset, int len)  throws IOException{
        int result = super.read(b,offset,len);
        for(int i = 0;i<result;i++){
         b[i] = (byte)Character.toUpperCase((char)(b[i]));
        }
        return result;
    }

}
