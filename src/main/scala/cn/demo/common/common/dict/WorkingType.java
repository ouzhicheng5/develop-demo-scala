package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum WorkingType {
    //粮油种植
    GRAIN_OIL_PLANT(4701),
    //经济作物种植
    INDUSTRIAL_CROP_PLANT(4702),
    //林木种植
    TREE_PLANT(4703),
    //畜禽养殖
    LIVESTOCK_BREEDING(4704),
    //水产养殖
    AQUICULTURE(4705),
    //农产品加工
    AGROTECHNY(4706),
    //农机具或库房
    FARM_TOOLS_OR_STOREROOMS(4707),
    //农产品烘储
    AGRICULTURAL_PRODUCTS_BAKE(4708),
    //农业生产设施大棚
    AGRICULTURAL_PRODUCTION_FACILITIES(4709),
    //观光农业
    AGRITOURISM(4710),
    //其他
    OTHER(4711),
    ;

    private int value;
    WorkingType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
