package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum RequestType {
    //新申请
    NEW_APPLY(4201),
    //正在业务处理
    IN_HAND(4202),
    //正在获取信用数据
    IN_OBTAIN_CREDIT_DATA(4203);

    private int value;
    RequestType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
