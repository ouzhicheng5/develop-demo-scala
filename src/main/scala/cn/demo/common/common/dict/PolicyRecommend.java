package cn.demo.common.common.dict;

/**
 * Created by ozc on 2017/9/6
 */
public enum PolicyRecommend {
    //政策推荐
    POLICY_RECOMMEND(4101);

    private int value;
    PolicyRecommend(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
