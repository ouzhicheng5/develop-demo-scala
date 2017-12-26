package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum InfoLabel {
    //贷款
    LOAN(1801),
    //补贴
    SUBSIDY(1802)
    ;

    private int value;
    InfoLabel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
