package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum IndustryType {
    //农业
    FARMING(1701),
    //林业
    FORESTRY(1702),
    //牧业
    GRAZIERY(1703),
    //副业
    PARERGON(1704),
    //渔业
    FISHING(1705),
    //其他
    RESTS(1706)
    ;

    private int value;
    IndustryType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
