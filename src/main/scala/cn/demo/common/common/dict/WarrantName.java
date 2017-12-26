package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum WarrantName {
    //农机具所有权
    OWNERSHIP_OF_FARM_MACHINERY(4901),
    //烘焙设施所有权
    OWNERSHIP_OF_BAKING_FACILITIES(4902),
    //圈舍所有权
    ENCLOSURE_OWNERSHIP(4903),
    //大棚所有权
    CANOPY_OWNERSHIP(4904),
    //林木所有权
    FOREST_TREE_OWNERSHIP(4905),
    //竹子所有权
    BAMBOO_OWNERSHIP(4906),
    //果树所有权
    FRUIT_TREE_OWNERSHIP(4907),
    //农村房屋产权
    PROPERTY_RIGHT_OF_RURAL_HOUSE(4908),
    //农村土地经营权
    RURAL_LAND_MANAGEMENT_RIGHTS(4909),
    //林地经营权
    WOODLAND_FRANCHISE_CONTRACT(4910),
    //养殖水面经营权
    MANAGEMENT_OF_AQUACULTURE_WATER(4911),
    //农村集体资产股份
    SHARES_OF_RURAL_COLLECTIVE_ASSETS(4912),

    ;

    private int value;
    WarrantName(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
