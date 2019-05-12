package yuanxingmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-11
 * Time: 13:44
 */
public class Mail {
    private String receiver;
    private String subject;
    private String content;
    private String tail;
    public Mail(EventTemplate eventTemplate){
        this.tail = eventTemplate.getEventContent();
        this.subject = eventTemplate.getEventSubject();
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
