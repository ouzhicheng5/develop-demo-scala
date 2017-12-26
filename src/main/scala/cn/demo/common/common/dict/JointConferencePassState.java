package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum JointConferencePassState {
    //审核通过
    PASS(7201),
    //审核不通过
    NOT_PASS(7202),
    //未审核
    UN_PASS(7203)
    ;

    private int value;
    JointConferencePassState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
