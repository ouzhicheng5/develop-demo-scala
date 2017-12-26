package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:36 
 */
public enum SocialMoralityEvaluation {
    //优
    EXCELLENT(6001),
    //良
    FINE(6002),
    //中
    SECONDARY(6003),
    //差
    BAD(6004)
    ;
    private int value;
    SocialMoralityEvaluation(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

}
