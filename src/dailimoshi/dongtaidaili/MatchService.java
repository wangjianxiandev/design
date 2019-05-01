package dailimoshi.dongtaidaili;

import java.lang.reflect.Proxy;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-01
 * Time: 16:22
 */
public class MatchService {
    public MatchService(){
        //分别 joe以不同的身份去访问修joe的信息，观察变化
        PersonBean joe = getPersonInfo("joe", "male", "running");
        PersonBean OwnerProxy =  getOwnProxy(joe);
        System.out.println("Name is "+ OwnerProxy.getName());
        System.out.println("Interest is  "+ OwnerProxy.getInterests());

        OwnerProxy.setInterests("Bowling");
        System.out.println("Intersets are " + OwnerProxy.getInterests());
        OwnerProxy.setHotOrNotRating(50);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
        OwnerProxy.setHotOrNotRating(40);
        System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
        System.out.println("**************");

        PersonBean nonOwnerProxy = getNotOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setInterests("haha");
        System.out.println("Interests are " + nonOwnerProxy.getInterests());
        nonOwnerProxy.setHotOrNotRating(60);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    PersonBean getPersonInfo(String name, String gender, String interest){
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender(gender);
        personBean.setInterests(interest);
        return personBean;
    }
    PersonBean getOwnProxy(PersonBean personBean){
        //new一个Proxy实体，传入具体的对象的加载，具体对象的接口，同时new一个自己的Hanlder的控制逻辑
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new OwnerInvocationHandler(personBean));
    }
    PersonBean getNotOwnerProxy(PersonBean personBean){
        return (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(),new NotOwnInvocationhandler(personBean));
    }

}
