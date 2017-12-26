package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 18:47 
 */
public enum CompanyCreditRatingType {
    //地税信用评价
    LOCAL(6401),
    //国税信用评价
    NATIONAL(6402)
    ;
    private int value;
    CompanyCreditRatingType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
