package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum PolicyLabel {
    //惠农
    BENEFITING_FARMERS(1901)
    ;

    private int value;
    PolicyLabel(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
