package structural.decorator.v1;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/3
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " " + battercake.cost());

        Battercake battercake1 = new BattercakeWithEgg();
        System.out.println(battercake1.getDesc() + " " + battercake1.cost());

        Battercake battercake2 = new BattercakeWithEggSausage();
        System.out.println(battercake2.getDesc() + " " + battercake2.cost());

    }
}
