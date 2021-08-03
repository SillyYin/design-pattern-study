package creational.prototype;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");

        for (int i = 0; i < 10; ++i) {
            Mail tempMail = (Mail) mail.clone();
            tempMail.setName("name" + i);
            tempMail.setEmailAddress("address" + i + "@qq.com");
            tempMail.setContent("中奖");
            MailUtil.sendMail(tempMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
