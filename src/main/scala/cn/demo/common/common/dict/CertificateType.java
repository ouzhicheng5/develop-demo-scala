package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum CertificateType {
    //身份证
    IDENTITY_CARD(4601),

    ;

    private int value;
    CertificateType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
