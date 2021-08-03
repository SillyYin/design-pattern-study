package creational.siglenton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setDate(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton"));
        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
