package creational.builder;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("name", "ppt", "video", "article", "qa");
        System.out.println(course);
    }
}
