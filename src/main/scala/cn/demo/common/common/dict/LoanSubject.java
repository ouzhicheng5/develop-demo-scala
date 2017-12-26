package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum LoanSubject {
    //个人
    PERSON(2701),
    //企业
    COMPANY(2702)
    ;

    private int value;
    LoanSubject(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
