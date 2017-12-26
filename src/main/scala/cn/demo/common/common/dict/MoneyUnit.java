package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MoneyUnit {
    //元
    YUAN(2201),
    //万元
    WAN_YUAN(2202),
    //亿元
    YI_YUAN(2203)
    ;

    private int value;
    MoneyUnit(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
