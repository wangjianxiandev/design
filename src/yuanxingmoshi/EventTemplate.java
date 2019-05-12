package yuanxingmoshi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-11
 * Time: 13:41
 */


/**
 * 类似于信息末尾的广告
 */
public class EventTemplate {
    private String eventSubject, eventContent;
    public EventTemplate(String eventSubject, String eventContent){
        this.eventSubject = eventSubject;
        this.eventContent = eventContent;
    }
    public String getEventSubject(){
        return eventSubject;
    }
    public String getEventContent(){
        return eventContent;
    }
}
