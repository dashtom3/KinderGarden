package cn.jiang.garden.enums;

/**
 * Created by Administrator on 2016/6/21.
 */
public enum EducationEnum {
    MiddleSchool("初中",1),
    HighSchool("高中/高职",2),
    undergraduate("本科",3),
    Master("硕士",4),
    Doctor("博士",5)
    ;

            ;

    private String label;
    private Integer code;

    EducationEnum() {
    }

    EducationEnum(String label, Integer code) {
        this.label = label;
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code.toString();
    }

    public static String parse(Integer code) {
        for (EducationEnum theEnum : EducationEnum.values()) {
            if (theEnum.getCode() == code) {
                return theEnum.getLabel();
            }
        }
        return null;
    }
}
