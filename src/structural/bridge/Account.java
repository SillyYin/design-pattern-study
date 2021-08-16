package structural.bridge;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 有银行类型和卡的类型
 * @date 2021/8/16
 */
public interface Account {
    Account openAccount();
    void showAccountType();
}
