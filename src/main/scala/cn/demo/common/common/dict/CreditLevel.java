package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum CreditLevel {
    //较差
    RANGE(4501),
    //中等
    MEDIUM(4502),
    //良好
    GOOD(4503),
    //优秀
    VERY_GOOD(4504),
    //极好;
    EXCELLENT(4505);
    private int value;
    CreditLevel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
