package cn.demo.common.common.dict;

/**
 * Creater: wangxiang
 * Email: wx_iter@163.com
 * Date: 2017/9/14.
 */
public enum FlowHandleType {

    //待审核
    IN_AUDIT(3901),
    //审核打回
    REPULSE(3902)
    ;

    private int value;
    FlowHandleType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
