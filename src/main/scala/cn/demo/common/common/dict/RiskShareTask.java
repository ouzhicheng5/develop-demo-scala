package cn.demo.common.common.dict;

public enum RiskShareTask {

    APPLY("申请"),FIRST_REVIEW("初审"),RE_REVIEW("复审"),AUDIT("审计"),DELIBERATE("审议"),APPROPRIATE("拨款");

    private String desc;

    RiskShareTask(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
