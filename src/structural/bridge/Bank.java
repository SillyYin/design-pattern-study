package structural.bridge;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 实现委托给Account
     * @return
     */
    abstract Account openAccount();
}
