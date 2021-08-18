package behavioral.command;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/18
 */
public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
