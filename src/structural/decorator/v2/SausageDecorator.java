package structural.decorator.v2;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
