package creational.siglenton;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 懒汉式单例模式（延迟加载）
 * @date 2021/8/2
 */
public class LazeSingleton {
    private static LazeSingleton lazeSingleton = null;

    private LazeSingleton() {

    }

    public static LazeSingleton getInstance() {
        if (lazeSingleton == null) {
            lazeSingleton = new LazeSingleton();
        }
        return lazeSingleton;
    }
}
