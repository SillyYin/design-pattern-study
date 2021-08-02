package creational.abstractfactory;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/2
 */
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
