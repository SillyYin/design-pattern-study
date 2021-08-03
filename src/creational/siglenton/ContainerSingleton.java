package creational.siglenton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<>();

    private ContainerSingleton() {

    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNoneBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
