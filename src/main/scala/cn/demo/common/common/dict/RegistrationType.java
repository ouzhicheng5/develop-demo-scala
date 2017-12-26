package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:01 
 */
public enum RegistrationType {

    //家庭农场
    FAMILY_FARM(5601),
    //合作社
    COOPERATIVE(5602),
    //有限责任公司
    COMPANY_WITH_LIMITED_LIABILITY(5603)
    ;
    private int value;
    RegistrationType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
