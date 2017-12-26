package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum HandlePeriod {
    //新申请
    NEW_APPLY(3801),
    //处理中
    IN_HAND(3802),
    //已拒绝
    REFUSED(3803),
    //已完成
    COMPLETED(3804),
    ;

    private int value;
    HandlePeriod(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
