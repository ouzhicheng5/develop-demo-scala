package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:36 
 */
public enum OperationSituation {
    //优
    EXCELLENT(6101),
    //良
    FINE(6102),
    //中
    SECONDARY(6103),
    //差
    BAD(6104)
    ;
    private int value;
    OperationSituation(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

}
