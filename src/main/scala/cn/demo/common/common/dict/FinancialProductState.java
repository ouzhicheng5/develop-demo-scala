package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum FinancialProductState {
    //未发布
    UNPUBLISHED(3401),
    //已发布
    PUBLISHED(3402),
    //已下架
    SOLD_OUTED(3403),
    //重新上架
    RESHELF(3404)
    ;

    private int value;
    FinancialProductState(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
