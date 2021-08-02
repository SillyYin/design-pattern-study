package creational.factorymethod;



/**
 * @author yinrongjie
 * @version 1.0
 * @description 应用层
 * @date 2021/8/2
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }
}
