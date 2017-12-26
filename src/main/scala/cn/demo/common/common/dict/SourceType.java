package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum SourceType {
    //PC端来源
    PC(7001),
    //APP端来源
    APP(7002),
    ;

    private int value;
    SourceType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
