package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum OrgSubclass {
    //默认
    DEFAULT(3001),
    //联席会议
    JOINT_MEETING(3002),
    //村站
    VILLAGE_STAND(3003),
    //银行
    BANK(3004),
    //保险
    INSURANCE(3005),
    //担保
    ASSURE(3006),
    //金融中介机构
    AGENCY(3008),
    ;

    private int value;
    OrgSubclass(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
