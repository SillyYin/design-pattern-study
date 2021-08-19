package behavioral.chainofresponsibility;

/**
 * @author yinrongjie
 * @version 1.0
 * @description 批准者
 * @date 2021/8/19
 */
public abstract class Approver {
    // 批准者中要声明一个批准者
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
