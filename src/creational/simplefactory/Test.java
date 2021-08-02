package creational.simplefactory;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 应用层
 * @date 2021/8/2
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();
    }
}
