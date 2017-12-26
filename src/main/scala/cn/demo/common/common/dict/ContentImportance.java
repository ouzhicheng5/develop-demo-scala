package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum ContentImportance {
    //不重要
    SLIGHT(501),
    //一般
    NORMAL(502),
    //较重要
    IMPORTANT(503),
    //非常重要
    EMPHASIZED(504)

    ;



    private int value;
    ContentImportance(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
