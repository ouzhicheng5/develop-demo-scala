package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum ContentState {
    //草稿
    IN_DRAFT(401),
    //待审核
    IN_AUDIT(402),
    //审核打回
    REPULSE(403),
    //审核通过
    PASSED(404)
    ;

    private int value;
    ContentState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
