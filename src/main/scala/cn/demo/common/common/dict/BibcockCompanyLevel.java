package cn.demo.common.common.dict;

/*
 * @author         ouzhicheng  
 * @version        V1.0   
 * @Date           2017/10/24 14:23 
 */
public enum BibcockCompanyLevel {

    //国家级
    COUNTRY_LEVEL(6801),
    //省级
    PROVINCE_LEVEL(6802),
    //市级
    CITY_LEVEL(6803),
    //其他
    OTHER(6804),

    ;

    private int value;
    BibcockCompanyLevel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
