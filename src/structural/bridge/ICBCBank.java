package structural.bridge;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class ICBCBank extends Bank{
    public ICBCBank(Account account) {
        super(account);
    }

    /**
     * 实现委托给Account
     *
     * @return
     */
    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        // 委托
        account.openAccount();
        return account;
    }
}
