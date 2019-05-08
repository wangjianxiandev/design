package Jishiqimoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 16:27
 */

/**
 * 加减乘除的一个抽象，可以分为左右两个表达式
 */
public abstract class SymbolExpresstion extends AbstractExpresstion{
    protected  AbstractExpresstion left;
    protected  AbstractExpresstion right;

    public SymbolExpresstion(AbstractExpresstion left, AbstractExpresstion right){
        this.left = left;
        this.right = right;
    }

}
