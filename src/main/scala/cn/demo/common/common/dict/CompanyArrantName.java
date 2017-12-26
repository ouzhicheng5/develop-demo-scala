package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:23 
 */
public enum CompanyArrantName {

    //农机具所有权
    OWNERSHIP_AGRICULTURAL_IMPLEMENTS(5901),
    //烘焙设置所有权
    BAKING_SET_OWNERSHIP(5902),
    //圈舍所有权
    HOUSING_OWNERSHIP(5903),
    //大棚所有权
    GREENHOUSE_OWNERSHIP(5904),
    //林木所有权
    OWNERSHIP_FOREST_TREES(5905),
    //竹子所有权
    BAMBOO_OWNERSHIP(5906),
    //果树所有权
    OWNERSHIP_FRUIT_TREES(5907),
    //农村房屋产权
    RURAL_HOUSING_PROPERTY_RIGHT(5908),
    //农村土地经营权
    RURAL_LAND_MANAGEMENT_RIGHT(5909),
    //林地经营权
    FOREST_LAND_MANAGEMENT_RIGHT(5910),
    //养殖水面经营权
    CULTIVATION_RIGHTSURFACE_MANAGEMENT(5911),
    //农村集体集资股份
    RURAL_COLLECTIVE_FUNDRAISING_SHARES(5912)
    ;

    private int value;
    CompanyArrantName(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
