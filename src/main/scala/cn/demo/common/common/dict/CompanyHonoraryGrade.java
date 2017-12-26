package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:42 
 */
public enum CompanyHonoraryGrade {
    //国家
    COUNTRY(6201),
    //省
    PROVINCE(6202),
    //市
    CITY(6203)
    ;
    private int value;
    CompanyHonoraryGrade(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

}
