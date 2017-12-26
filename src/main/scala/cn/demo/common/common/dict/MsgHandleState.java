package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MsgHandleState {
    //已处理
    HANDLED(3601),
    //未处理
    UNTREATED(3602)
    ;

    private int value;
    MsgHandleState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
