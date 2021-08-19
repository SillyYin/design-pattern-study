package behavioral.chainofresponsibility;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/19
 */
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("AAAA");
        course.setArticle("Article");
        course.setVideo("Video");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
