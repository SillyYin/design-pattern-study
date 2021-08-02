package creational.siglenton;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 静态内部类的单例
 * @date 2021/8/2
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {

    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
