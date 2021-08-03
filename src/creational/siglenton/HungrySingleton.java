package creational.siglenton;

import java.io.Serializable;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 饿汉式
 * @date 2021/8/2
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
