package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum InfoRecommend {
    //新闻
    NEWS(3101),
    //村务
    VILLAGE_AFFAIRS(3102),
    //招工用工
    HIRE_LABOR(3103),
    //种植指导
    PLANT_GUIDANCE(3104),
    //特色景点
    SPECIAL_SCENIC_SPOT(3105),
    //特色美食
    SPECIAL_DELICIOUS_FOOD(3106)
    ;

    private int value;
    InfoRecommend(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
