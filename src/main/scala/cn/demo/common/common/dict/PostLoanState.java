package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum PostLoanState {
    //正常还款
    NORMAL_REPAYMENT(6901),
    //已逾期
    OVERDUE(6902),
    //已申请风险分担
    RISK_SHARE_APPLIED(6903),
    //申请风险分担成功
    APPLY_RISK_SHARE_SUCCESS(6904),
    //已申请二次风险分担
    TWO_RISK_SHARE_APPLIED(6905),
    //申请二次风险分担成功
    APPLY_TWO_RISKSHARE_SUCCESS(6906),
    //已还完
    FINISHED(6907),
    ;

    private int value;
    PostLoanState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
