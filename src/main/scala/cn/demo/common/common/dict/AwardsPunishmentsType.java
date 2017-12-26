package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum AwardsPunishmentsType {
    //奖励
    AWARD(5201),
    //处罚
    PUNISH(5202),
    ;

    private int value;
    AwardsPunishmentsType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
