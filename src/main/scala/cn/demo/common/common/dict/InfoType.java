package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum InfoType {
    //新闻
    NEWS(301),
    //村务
    VALLAGE_AFFAIRE(302),
    //招工用工
    RECRUIT_USE(303),
    //种植指导
    PLANT_GUIDANCE(304),
    //特色景点
    SPECIAL_SCENIC_SPOT(305),
    //特色美食
    SPECIAL_DELICIOUS_FOOD(306)
    ;

    private int value;
    InfoType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
