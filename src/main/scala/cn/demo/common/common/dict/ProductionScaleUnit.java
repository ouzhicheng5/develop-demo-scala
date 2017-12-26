package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:20 
 */
public enum ProductionScaleUnit {
    //头
    HEAD(5801),
    //亩
    MU(5802)
    ;


    private int value;
    ProductionScaleUnit(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
