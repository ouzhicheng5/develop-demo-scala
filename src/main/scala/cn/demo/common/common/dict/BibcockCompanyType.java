package cn.demo.common.common.dict;

/*
 * @author         ouzhicheng  
 * @version        V1.0   
 * @Date           2017/10/24 14:23 
 */
public enum BibcockCompanyType {

    //加工业
    PROCESSING_INDUSTRY(6701),
    //市场销售
    MARKETING(6702),
    //种养殖业
    KINDS_OF_FARMING(6703),
    //种业
    SEED_INDUSTRY(6704),
    //其他
    OTHER(6705),

    ;

    private int value;
    BibcockCompanyType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
