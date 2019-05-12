package fangwenzhemoshi.fangwenzhe;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-12
 * Time: 14:18
 */
public interface Visitor {
    //把elemt反馈给访问者，
    abstract public void Visit(Element element);
}
