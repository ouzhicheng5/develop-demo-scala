package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:45 
 */
public enum RewardPunishment {

    //奖励
    REWARD(6301),
    //惩罚
    PUNISHMENT(6302)
    ;
    private int value;
    RewardPunishment(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
