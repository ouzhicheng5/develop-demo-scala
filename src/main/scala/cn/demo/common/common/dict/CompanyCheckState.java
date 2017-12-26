package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum CompanyCheckState {
    //审核通过
    CHECK_PASS(3503),
    //审核不通过
    CHECK_NOTPASS(3502),
    //待审核
    WAIT_CHECK(3501)
    ;

    private int value;
    CompanyCheckState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
