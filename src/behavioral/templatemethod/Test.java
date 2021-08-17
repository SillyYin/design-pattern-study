package behavioral.templatemethod;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/17
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("========== design course ===========");
        ACourse designCourse = new DesignPatternCourse();
        designCourse.makeCourse();
        System.out.println("=====================================");

        System.out.println("========== fe course ===========");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("=====================================");
    }
}
