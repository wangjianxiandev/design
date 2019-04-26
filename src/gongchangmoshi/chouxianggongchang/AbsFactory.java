package gongchangmoshi.chouxianggongchang;

import gongchangmoshi.Pizza;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-17
 * Time: 19:43
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
