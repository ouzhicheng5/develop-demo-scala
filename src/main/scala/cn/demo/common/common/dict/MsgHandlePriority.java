package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MsgHandlePriority {
    //低
    LOW(701),
    //中
    MIDDLE(702),
    //高
    HIGH(703)
    ;

    private int value;
    MsgHandlePriority(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
