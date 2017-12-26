package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum RiskShareFundType {
    //农村产权直接抵(质)押融资风险资金
    RURAL_EQUITY_MORTGAGE_RISKFUND(4301),
    //惠农贷风险资金
    CORRESPONDING_CREDIT_RISKFUND(4302),
    //保险公司信用保证保险风险资金
    CREDIT_AND_GUARANTEE_INSURANCE_RISKFUND(4303)
    ;

    private int value;
    RiskShareFundType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
