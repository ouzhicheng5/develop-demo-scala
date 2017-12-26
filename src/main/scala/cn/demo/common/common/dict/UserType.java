package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum UserType {
    //系统后端管理
    SYSTEM_BACKEND_ADMIN(201),
    //个人
    PERSONAL(202),
    //企业
    COMPANY(203),
    //政府
    GOVERNMENT(204),
    //银行
    BANK(205),
    //保险
    INSURANCE(206),
    //担保
    GUARANTEE(207),
    //收储机构
    PURCHASE_STORAGE(208)
    ;
    private int value;
    UserType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
