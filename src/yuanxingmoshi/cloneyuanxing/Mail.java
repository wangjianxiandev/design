package yuanxingmoshi.cloneyuanxing;

import yuanxingmoshi.EventTemplate;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-11
 * Time: 14:19
 */

/**
 * buy
 */
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String content;
    private String tail;
    private ArrayList<String> ars;
    public Mail(EventTemplate eventTemplate){
        this.tail = eventTemplate.getEventContent();
        this.subject = eventTemplate.getEventSubject();
    }

    @Override
    public Mail clone(){
        Mail mail = null;
        try{
            //克隆出来的是一块新的内存区域
            mail = (Mail) super.clone();
            //对浅拷贝的对象要额外加一步.,独立拷贝，这样就将ArrayList完全区分开来
            //如果不加这一步就相当于对ArrayList进行浅拷贝，单纯拷贝引用
            mail.ars = (ArrayList<String>) this.ars.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

}
