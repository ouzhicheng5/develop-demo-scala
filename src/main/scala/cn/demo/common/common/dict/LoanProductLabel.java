package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum LoanProductLabel {
    /*//惠东
    GOVERNMENT_ORG(2001),
    //惠农
    BANKING_ORG(2002),
    //低息
    STOCKPILE_ORGs(2003),
    //大额
    STOCKPILE_ORG(2004),*/
    ;

    private int value;
    LoanProductLabel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
