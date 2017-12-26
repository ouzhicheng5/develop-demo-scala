package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum OrgRecommend {
    //银行机构
    BANK_ORG(3201),
    //保险机构
    FINANCIAL_ORG(3202),
    //担保机构
    GUARANTEE_ORG(3203),

    ;

    private int value;
    OrgRecommend(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
