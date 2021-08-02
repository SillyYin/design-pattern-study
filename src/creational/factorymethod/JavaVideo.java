package creational.factorymethod;



/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class JavaVideo extends Video {
    /**
     * 用于生产视频
     */
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
