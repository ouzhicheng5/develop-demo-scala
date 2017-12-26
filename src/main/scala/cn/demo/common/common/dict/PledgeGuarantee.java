package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum PledgeGuarantee {
    //存单
    DEPOSIT_RECEIPT(2501),
    //保单
    GUARANTEE_RECEIPT(2502)
    ;

    private int value;
    PledgeGuarantee(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
