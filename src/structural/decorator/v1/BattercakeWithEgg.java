package structural.decorator.v1;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
