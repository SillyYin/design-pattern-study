package structural.bridge;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 定期账号
 * @date 2021/8/16
 */
public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是定期账号");
    }
}
