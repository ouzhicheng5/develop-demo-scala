package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum SocialMoral {
    //差
    BAD(5001),
    //中
    MIDDLE(5002),
    //良
    GOOD(5003),
    //优
    VERY_GOOD(5004),
    ;

    private int value;
    SocialMoral(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
