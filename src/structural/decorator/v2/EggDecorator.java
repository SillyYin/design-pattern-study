package structural.decorator.v2;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake battercake) {
        super(battercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
