package Jishiqimoshi;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 16:20
 */

/**
 * 抽象表达式，解析的超类
 */
public abstract class AbstractExpresstion {
    /**插入的是一条数据
     * @param var
     * @return
     */
    public abstract Float interpreter(HashMap<String, Float> var);
}
