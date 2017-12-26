package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:06 
 */
public enum ProductionManagementType {


    //粮油种植
    GRAIN_OIL_CULTIVATION(5701),
    //经济作物种植
    CASH_CROP_CULTIVATION(5702),
    //林木种植
    TREE_PLANTING(5703),
    //畜禽养殖
    LIVESTOCK_BREEDING(5704),
    //水产养殖
    AQUICULTURE(5705),
    //农产品加工
    FARM_PRODUCT_PROCESSING(5706),
    //农机具或库房
    FARM_IMPLEMENTS_STOREHOUSES(5707),
    //农产品烘储
    DRYING_AGRICULTURAL_PRODUCTS(5708),
    //农业生产设施大棚
    AGRICULTURAL_PRODUCTION_FACILITIES_GREENHOUSE(5709),
    //观光农业
    SIGHTSEEING_AGRICULTURE(5710),
    //其他
    OTHER(5711)
    ;
    private int value;
    ProductionManagementType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
