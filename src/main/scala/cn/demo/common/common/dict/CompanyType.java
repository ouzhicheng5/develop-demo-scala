package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum CompanyType {
    //有限责任公司
    LIMITED_LIABILITY_COMPANY(1601),
    //合作社
    COOPERATION(1602),
    //家庭农场
    FAMILY_FARM(1603)
    ;

    private int value;
    CompanyType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
