package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum Gender {
    //未知
    UNKNOWN(101),
    //男
    MALE(102),
    //女
    FEMALE(103);

    private int value;
    Gender(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
