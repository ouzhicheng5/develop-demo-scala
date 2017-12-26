package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum NdtPolicyType {
    //普通政策
    ACTIVE(6501),
    //农贷通政策
    TEMPORARY_LOCKED(6502)
    ;

    private int value;
    NdtPolicyType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
