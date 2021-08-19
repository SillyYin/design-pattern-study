package behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/19
 */
public class ArticleApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneBlank(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记，不批准");
            return;
        }
    }
}
