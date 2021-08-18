package behavioral.command;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/18
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("video1");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);

        staff.executeCommands();


        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();
    }
}
