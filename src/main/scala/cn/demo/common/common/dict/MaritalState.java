package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MaritalState {
    //未婚
    NOT_MARRIED(1001),
    //已婚
    MARRIED(1002),
    //离婚
    DIVORCED(1003),
    //丧偶
    WIDOWED(1004)
    ;

    private int value;
    MaritalState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
