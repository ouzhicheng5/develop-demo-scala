package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum MajorProjectType {
    //个人
    PERSONAL(7101),
    //公司
    COMPANY(7102),
    //合作社
    COOPERATION(7103),
    //家庭农场
    FARM(7104),
    ;

    private int value;
    MajorProjectType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
