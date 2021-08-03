package structural.adapter.classadapter;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("具体的目标方法");
    }
}
