package creational.factorymethod;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
