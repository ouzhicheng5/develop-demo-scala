package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum BusinessCase {
    //差
    BAD(5101),
    //中
    MIDDLE(5102),
    //良
    GOOD(5103),
    //优
    VERY_GOOD(5104),
    ;

    private int value;
    BusinessCase(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
