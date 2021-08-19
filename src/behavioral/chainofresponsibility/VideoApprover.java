package behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/19
 */
public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneBlank(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频，不批准");
            return;
        }
    }
}
