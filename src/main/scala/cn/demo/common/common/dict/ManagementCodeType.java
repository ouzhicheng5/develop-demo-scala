package cn.demo.common.common.dict;

/*
 * @author         wangjin  
 * @version        V1.0   
 * @Date           2017/10/11 17:56 
 */
public enum ManagementCodeType {
    //三证合一
    THREE_IN_ONE(5501),
    //营业执照,
    BUSINESS_LICENSE(5502)
    ;

    private int value;
    ManagementCodeType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
