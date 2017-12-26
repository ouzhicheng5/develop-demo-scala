package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum CreditRatingType {
    //地税信用评价
    TAX_CREDIT_EVALUATION(5301),
    //国税信用评价
    NATIONAL_TAX_CREDIT_EVALUATION(5302),
    ;

    private int value;
    CreditRatingType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
