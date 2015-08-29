package com.xiaoqing.flight.data.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table AC_WEIGHT_LIMIT.
 */
public class AcWeightLimit {

    private long id;
    private String AcType;
    private String Weight;
    private String WeightCg1;
    private String WeightCg2;
    private String OpUser;
    private String OpDate;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public AcWeightLimit() {
    }

    public AcWeightLimit(long id) {
        this.id = id;
    }

    public AcWeightLimit(long id, String AcType, String Weight, String WeightCg1, String WeightCg2, String OpUser, String OpDate) {
        this.id = id;
        this.AcType = AcType;
        this.Weight = Weight;
        this.WeightCg1 = WeightCg1;
        this.WeightCg2 = WeightCg2;
        this.OpUser = OpUser;
        this.OpDate = OpDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAcType() {
        return AcType;
    }

    public void setAcType(String AcType) {
        this.AcType = AcType;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getWeightCg1() {
        return WeightCg1;
    }

    public void setWeightCg1(String WeightCg1) {
        this.WeightCg1 = WeightCg1;
    }

    public String getWeightCg2() {
        return WeightCg2;
    }

    public void setWeightCg2(String WeightCg2) {
        this.WeightCg2 = WeightCg2;
    }

    public String getOpUser() {
        return OpUser;
    }

    public void setOpUser(String OpUser) {
        this.OpUser = OpUser;
    }

    public String getOpDate() {
        return OpDate;
    }

    public void setOpDate(String OpDate) {
        this.OpDate = OpDate;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}