package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum ProductType {
    //银行产品
    BANK_PRODUCT(3301),
    //保险产品
    FINANCIAL_PRODUCT(3302),
    //担保产品
    GUARANTEE_PRODUCT(3303),
    ;

    private int value;
    ProductType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
