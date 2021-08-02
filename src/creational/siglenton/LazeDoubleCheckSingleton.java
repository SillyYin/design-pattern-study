package creational.siglenton;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class LazeDoubleCheckSingleton {
    private volatile static LazeDoubleCheckSingleton instance = null;

    private LazeDoubleCheckSingleton() {

    }

    public static LazeDoubleCheckSingleton getInstance() {
        // 对象创建好之后就不会进入到if，也就不会再进行加锁
        if (instance == null) {
            synchronized (LazeDoubleCheckSingleton.class) {
                if (instance == null) {
                    // 1. 分配内存给对象
                    // 2. 初始化对象
                    // 3. 设置instance对象指向刚分配的内存
                    // 第2步和第3步可能会重排序
                    instance = new LazeDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
