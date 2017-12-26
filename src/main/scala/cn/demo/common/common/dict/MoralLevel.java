package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MoralLevel {
    //极坏
    WORST(1101),
    //一般
    JUST_SOSO(1102),
    //较好
    BETTER(1103),
    //极好
    BEST(1104)
    ;



    private int value;
    MoralLevel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
