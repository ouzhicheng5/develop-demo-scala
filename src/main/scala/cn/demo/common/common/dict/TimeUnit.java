package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum TimeUnit {
    //日
    day(2301),
    //月
    month(2302),
    //年
    year(2303)
    ;

    private int value;
    TimeUnit(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
