package zuhe;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-04-26
 * Time: 20:52
 */
public class ComposeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<Iterator>();
    public ComposeIterator(Iterator iterator){
        stack.push(iterator);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        if(!stack.empty()){//说明遍历完成
            return false;
        }
        Iterator iterator = stack.peek();//看看堆栈最上层的迭代器
        if(!iterator.hasNext()){//因为最上层的迭代器本身可能是一个菜单项或者子菜单项的迭代器
            stack.pop();//如果遍历完了
            return hasNext();
        }else {
            return true;//菜单项
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.peek();//拿出最上面一层
            MenuComponent menuComponent = (MenuComponent)iterator.next();//获取到超类类型
            stack.push(menuComponent.getIterator());//在堆栈的顶层，获取到要访问的元素，有可能是子菜单或者是菜单项，d但是我们都会得到迭代器，我们放入栈中，让下次迭代器访问如果是子菜单这一层会遍历，如果是菜单项，在hashNext中会弹掉。
            return menuComponent;
        }
        return null;
    }
}
