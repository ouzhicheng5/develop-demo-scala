package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum Education {
    //文盲
    ILLITERATE(1201),
    //小学
    PRIMARY(1202),
    //初中
    SECONDARY(1203),
    //高中
    SENIOR(1204),
    //本科
    BACHELOR(1205),
    //研究生
    MASTER(1206),
    //博士及以上学历
    DOCTOR_ORABOVE(1207)
    ;

    private int value;
    Education(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
