package dailimoshi.dongtaidaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 16:20
 */
public class NotOwnInvocationhandler implements InvocationHandler {
    PersonBean personBean;
    public NotOwnInvocationhandler(PersonBean personBean){
        this.personBean =  personBean;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")){//所有的get方法，调用方法使用的参数
            return method.invoke(personBean, args);
        }else if(method.getName().equals("setHotOrNotRating")){
            return method.invoke(personBean, args);


        }else if(method.getName().startsWith("set")){
            return new IllegalAccessException();

        }
        return null;
    }
}
