package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum ThirdAccountSource {
    //微信
    WEBCHAT(1301),
    //微博
    MICROBLOG(1302)
    ;

    private int value;
    ThirdAccountSource(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
