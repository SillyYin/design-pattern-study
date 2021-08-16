package structural.bridge;

/**
 * @author yinrongjie
 * @version 1.0
 * @description
 * @date 2021/8/16
 */
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank1 = new ICBCBank(new SavingAccount());
        Account icbcAccount1 = icbcBank1.openAccount();
        icbcAccount1.showAccountType();
    }
}
