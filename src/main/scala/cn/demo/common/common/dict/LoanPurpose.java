package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum LoanPurpose {
    //涉农项目
    AGRICULTURAL_PROJECT(2101),
    //教育求学
    EDUCATION_SCHOOL(2102),
    //生活消费
    LIVING_CONSUMPTION(2103),
    //其他
    OTHER(2104)
    ;

    private int value;
    LoanPurpose(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
