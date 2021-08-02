package creational.simplefactory;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 应用层
 * @date 2021/8/2
 */
public class Test {
    public static void main(String[] args) {
        // 父类声明子类实现
        Video video = new JavaVideo();
        video.produce();
    }
}
