package Jishiqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 16:24
 */

import java.util.HashMap;

/**
 * 变量表达式，和字段对应
 */
public class VarExpresstion extends AbstractExpresstion{
    private String key;
    public VarExpresstion(String key){
        this.key = key;
    }

    /**
     * 传入键的参数，返回数值
     * @param var
     * @return
     */
    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return var.get(this.key);
    }
}
