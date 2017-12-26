package cn.demo.common.common.dict;

public enum AdminDivisionLevel {
    PROVINCE(1,"省"),CITY(2,"市"),COUNTY(3,"县"),TOWN(4,"镇"),VILLAGE(5,"村");

    private int value;

    private String name;

    AdminDivisionLevel(int value,String name) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
