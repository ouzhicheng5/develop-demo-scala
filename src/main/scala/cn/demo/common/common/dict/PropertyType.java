package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum PropertyType {
    //商品房屋（房产、车位、商铺、写字楼)
    commercial_house(2401),
    //农村产权房屋(自建散居、集中新居)
    village_property_house(2402),
    //工业建设土地及厂房
    industry_construction_land_plant(2403),
    //国有建设用地使用权
    national_land_useRight(2404),
    //林权
    forest_right(2405),
    //农村集体建设用地使用权
    rural_collective_construction_land(2406),
    //农村土地承包经营权
    rural_contracted_land_useRights(2407)
    ;

    private int value;
    PropertyType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
