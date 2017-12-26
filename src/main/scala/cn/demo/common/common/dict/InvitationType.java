package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum InvitationType {
    //基于申请
    BASE_APPLY(3701),
    //银行主动
    BANKS_ACTIVELY(3702)
    ;

    private int value;
    InvitationType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
