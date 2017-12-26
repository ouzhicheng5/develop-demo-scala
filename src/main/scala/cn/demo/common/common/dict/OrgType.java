package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum OrgType {
    //政府机构
    GOVERNMENT_ORG(901),
    //金融机构
    BANKING_ORG(902),
    //收储机构
    STOCKPILE_ORG(903)
    ;

    private int value;
    OrgType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
