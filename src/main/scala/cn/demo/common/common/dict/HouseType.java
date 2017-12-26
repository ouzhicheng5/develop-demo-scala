package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum HouseType {
    //商品房
    COMMERCIAL_RESIDENTIAL_BUILDING(5401),
    //农房
    RURAL_HOUSING(5402)
    ;

    private int value;
    HouseType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
