package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum LoanType {
    //信用贷款
    CREDIT_LOAN(2801),
    //担保贷款
    ASSURE_LOAN(2802),
    //抵押贷款
    GUARANTY_LOAN(2803),
    //质押贷款
    PLEDGE_LOAN(2804)
    ;

    private int value;
    LoanType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
