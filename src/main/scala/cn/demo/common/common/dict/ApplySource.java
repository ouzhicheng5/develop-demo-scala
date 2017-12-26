package cn.demo.common.common.dict;

public enum ApplySource {

    NDT(7301), AGENCY(7302),FM(7303);

    private int value;

    ApplySource(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
