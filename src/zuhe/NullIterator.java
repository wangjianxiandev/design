package zuhe;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 20:43
 */

/**
 * 目的直接调用即可不需要判断是否为空
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
