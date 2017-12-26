package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MsgChannel {
    //站内信
    SITE_MSG(601),
    //短信
    SMS(602)

    ;

    private int value;
    MsgChannel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
