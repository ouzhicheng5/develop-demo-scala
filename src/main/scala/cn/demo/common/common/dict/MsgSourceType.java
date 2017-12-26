package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MsgSourceType {
    //普通通知
    NORMAL_NOTICE(801),
    //流程通知
    FLOW_NOTICE(802),
    //告警通知
    WARN_NOTICE(803)

    ;



    private int value;
    MsgSourceType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
