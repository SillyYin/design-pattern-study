package creational.simplefactory;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class VideoFactory {
    /**
     * 使用反射来实现一个简单工厂
     * @param c
     * @return
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
