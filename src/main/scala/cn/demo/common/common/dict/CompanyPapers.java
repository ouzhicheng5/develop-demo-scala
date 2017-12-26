package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum CompanyPapers {
    //普通营业执照
    GENERAL_CHARTER(1501),
    //多证合一营业执照
    MORETOONE_CHARTER(1502)
    ;

    private int value;
    CompanyPapers(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
