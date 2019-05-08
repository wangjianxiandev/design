package Jishiqimoshi;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-08
 * Time: 16:31
 */
public class AddExpresstion extends SymbolExpresstion{
    public AddExpresstion(AbstractExpresstion left, AbstractExpresstion right){
        super(left, right);
    }
    @Override
    public Float interpreter(HashMap<String, Float> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
