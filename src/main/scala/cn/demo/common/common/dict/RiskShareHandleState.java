package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum RiskShareHandleState {
    //未申请
    NOT_APPLY(4401),
    //已申请
    APPLIED(4402),
    //已初审
    FIRST_TRIAL(4403),
    //已复审
    RECHECKED(4404),
    //已审计
    AUDITED(4405),
    //已审议
    DELIBERATIONED(4406),
    //已放款
    MAKE_LOAN(4407),
    //已拒绝
    REFUSED(4408),
    //结束
    END(4409)
    ;

    private int value;
    RiskShareHandleState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
