package creational.builder.v2;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("name").buildCoursePPT("ppt").buildCourseVideo("video").buildCourseQA("qa").build();
        System.out.println(course);
    }
}
