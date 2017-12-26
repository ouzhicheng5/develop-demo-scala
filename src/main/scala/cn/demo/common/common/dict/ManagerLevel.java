package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum ManagerLevel {
    //初级
    PRIMARY(4801),
    //中级
    MIDDLE(4802),
    //高级
    ADVANCED(4803),
    ;

    private int value;
    ManagerLevel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
