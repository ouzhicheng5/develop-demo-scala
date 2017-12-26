package cn.demo.common.common.dict;

/*
 * @author         ouzhicheng  
 * @version        V1.0   
 * @Date           2017/10/24 14:23 
 */
public enum BibcockIndustryType {

    //蚕桑
    SERICULTURE(6601),
    //茶业
    TEA_INDUSTRY(6602),
    //动物药业
    ANIMAL_PHARMACEUTICAL_ESTATE(6603),
    //蜂产品
    BEE_PRODUCT(6604),
    //花卉苗木
    FLOWER_SEEDLING_WOOD(6605),
    //家禽
    POULTRY(6606),
    //粮油
    GRAIN_AND_OIL(6607),
    //林竹
    BAMBOO(6608),
    //棉花
    COTTON(6609),
    //水果
    FRUIT(6610),
    //牛羊类
    BOVOID(6611),
    //乳业
    DAIRY_INDUSTRY(6612),
    //生猪
    PIG(6613),
    //食用菌
    EDIBLE_MUSHROOMS(6614),
    //市场
    BAZAAR(6615),
    //蔬菜
    VEGETABLES(6616),
    //水产类
    SEAFOOD(6617),
    //饲料
    FODDER(6618),
    //油料
    OIL_PLANTS(6619),
    //中药材
    CHINESE_MEDICINAL_CROP(6620),
    //种业
    SEED_INDUSTRY(6621),
    //其他
    OTHER(6622),
    ;

    private int value;
    BibcockIndustryType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
