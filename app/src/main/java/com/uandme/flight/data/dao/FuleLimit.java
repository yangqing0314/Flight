package com.uandme.flight.data.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table FULE_LIMIT.
 */
public class FuleLimit {

    private Long id;
    private String AcType;
    private Integer FuleWeight;
    private Integer FuleLj;
    private String OpUser;
    private String OpDate;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public FuleLimit() {
    }

    public FuleLimit(Long id) {
        this.id = id;
    }

    public FuleLimit(Long id, String AcType, Integer FuleWeight, Integer FuleLj, String OpUser, String OpDate) {
        this.id = id;
        this.AcType = AcType;
        this.FuleWeight = FuleWeight;
        this.FuleLj = FuleLj;
        this.OpUser = OpUser;
        this.OpDate = OpDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcType() {
        return AcType;
    }

    public void setAcType(String AcType) {
        this.AcType = AcType;
    }

    public Integer getFuleWeight() {
        return FuleWeight;
    }

    public void setFuleWeight(Integer FuleWeight) {
        this.FuleWeight = FuleWeight;
    }

    public Integer getFuleLj() {
        return FuleLj;
    }

    public void setFuleLj(Integer FuleLj) {
        this.FuleLj = FuleLj;
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
