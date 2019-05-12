package yuanxingmoshi;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wjx
 * Date: 2019-05-11
 * Time: 13:46
 */
public class MainTest {
    public static void main(String[] args) {

        int i = 0;
        int MAX_COUNT= 10;

        EventTemplate eventTemplate = new EventTemplate("9月份信用卡账单", "抽奖");

        Mail mail = new Mail(eventTemplate);

        while (i<MAX_COUNT){
            mail.setContent(getRandString(5)+",先生（女士）：您的信用卡账单"+mail.getTail());
            mail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(mail);
            i++;
        }
    }
    public static String getRandString(int maxLength){
        String source = "wjxwjxwjxwjxwjxwjxwjxjw";
        StringBuffer stringBuffer = new StringBuffer();
        Random random  = new Random();
        for(int i = 0;i<maxLength;i++){
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }

    public static void sendMail(Mail mail){
        System.out.println("标题："+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t内容："+mail.getContent()+"\t发送成功");
    }
}
