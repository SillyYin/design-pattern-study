package structural.decorator.v2;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public abstract class AbstractDecorator extends ABattercake{
    protected ABattercake battercake;

    public AbstractDecorator(ABattercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getDesc() {
        return battercake.getDesc();
    }

    @Override
    protected int cost() {
        return battercake.cost();
    }
}
