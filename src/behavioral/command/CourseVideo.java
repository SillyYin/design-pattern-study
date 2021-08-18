package behavioral.command;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/18
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void open() {
        System.out.println(this.name + "视频开放");
    }

    public void close() {
        System.out.println(this.name + "视频关闭");
    }
}
