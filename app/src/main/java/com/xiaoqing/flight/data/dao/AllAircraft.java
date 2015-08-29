package com.xiaoqing.flight.data.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table ALL_AIRCRAFT.
 */
public class AllAircraft {

    private Long id;
    private String AircraftReg;
    private String UserCode;
    private String AircraftType;
    private Integer Bw;
    private Double Lj;
    private String LayoutPic;
    private String OpDate;
    private Integer SysVersion;
    private String AcRemark;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public AllAircraft() {
    }

    public AllAircraft(Long id) {
        this.id = id;
    }

    public AllAircraft(Long id, String AircraftReg, String UserCode, String AircraftType, Integer Bw, Double Lj, String LayoutPic, String OpDate, Integer SysVersion, String AcRemark) {
        this.id = id;
        this.AircraftReg = AircraftReg;
        this.UserCode = UserCode;
        this.AircraftType = AircraftType;
        this.Bw = Bw;
        this.Lj = Lj;
        this.LayoutPic = LayoutPic;
        this.OpDate = OpDate;
        this.SysVersion = SysVersion;
        this.AcRemark = AcRemark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAircraftReg() {
        return AircraftReg;
    }

    public void setAircraftReg(String AircraftReg) {
        this.AircraftReg = AircraftReg;
    }

    public String getUserCode() {
        return UserCode;
    }

    public void setUserCode(String UserCode) {
        this.UserCode = UserCode;
    }

    public String getAircraftType() {
        return AircraftType;
    }

    public void setAircraftType(String AircraftType) {
        this.AircraftType = AircraftType;
    }

    public Integer getBw() {
        return Bw;
    }

    public void setBw(Integer Bw) {
        this.Bw = Bw;
    }

    public Double getLj() {
        return Lj;
    }

    public void setLj(Double Lj) {
        this.Lj = Lj;
    }

    public String getLayoutPic() {
        return LayoutPic;
    }

    public void setLayoutPic(String LayoutPic) {
        this.LayoutPic = LayoutPic;
    }

    public String getOpDate() {
        return OpDate;
    }

    public void setOpDate(String OpDate) {
        this.OpDate = OpDate;
    }

    public Integer getSysVersion() {
        return SysVersion;
    }

    public void setSysVersion(Integer SysVersion) {
        this.SysVersion = SysVersion;
    }

    public String getAcRemark() {
        return AcRemark;
    }

    public void setAcRemark(String AcRemark) {
        this.AcRemark = AcRemark;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}