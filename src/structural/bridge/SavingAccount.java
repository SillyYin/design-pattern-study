package structural.bridge;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 活期账号
 * @date 2021/8/16
 */
public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是活期账号");
    }
}
