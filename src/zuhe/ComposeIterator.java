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
        if(!stack.empty()){//空的说明遍历完成
            return false;
        }
        Iterator iterator = stack.peek();//看看堆栈最上层的迭代器，并不弹掉
        if(!iterator.hasNext()){//区别菜单项和子菜单
            stack.pop();//菜单项弹掉
            return hasNext();//看下一个元素，栈的指针向下走一个
        }else {
            return true;//然后看一下这个迭代器有没有下一个，因为最上层的迭代器本身可能是一个菜单项或者子菜单项的迭代器，所以他可能是有下一个的，可以继续遍历
        }
    }

    @Override
    public Object next() {
        if(hasNext()){//判断栈中是否有为访问的迭代器
            Iterator iterator = stack.peek();//拿出最上面一层
            MenuComponent menuComponent = (MenuComponent)iterator.next();//使用next()获取到超类类型
            stack.push(menuComponent.getIterator());//获取到的迭代器再push()进去，在堆的顶层，获取到要访问的元素，有可能是子菜单或者是菜单项，不管怎么样我们都会得到迭代器，我们放入栈中，让下次迭代器访问如果是子菜单,这个迭代器会有数据，这一层会遍历，如果是菜单项得到的是空的迭代器，在hashNext的pop()中会弹掉。
            return menuComponent;
        }
        return null;
    }
}
