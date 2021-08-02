package creational.abstractfactory;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
