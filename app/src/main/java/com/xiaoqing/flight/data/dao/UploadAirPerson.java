package com.xiaoqing.flight.data.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table UPLOAD_AIR_PERSON.
 */
public class UploadAirPerson {

    private Long id;
    private String AircraftReg;
    private String FlightId;
    private Integer SeatId;
    private String SeatCode;
    private String SeatType;
    private Float AcTypeSeatLimit;
    private Float AcTypeLb;
    private Float AcRegCargWeight;
    private Float AcRegCagLj;
    private Float SeatLastLimit;
    private String PassagerName;
    private Float RealWeight;
    private String OpUser;
    private String OpDate;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public UploadAirPerson() {
    }

    public UploadAirPerson(Long id) {
        this.id = id;
    }

    public UploadAirPerson(Long id, String AircraftReg, String FlightId, Integer SeatId, String SeatCode, String SeatType, Float AcTypeSeatLimit, Float AcTypeLb, Float AcRegCargWeight, Float AcRegCagLj, Float SeatLastLimit, String PassagerName, Float RealWeight, String OpUser, String OpDate) {
        this.id = id;
        this.AircraftReg = AircraftReg;
        this.FlightId = FlightId;
        this.SeatId = SeatId;
        this.SeatCode = SeatCode;
        this.SeatType = SeatType;
        this.AcTypeSeatLimit = AcTypeSeatLimit;
        this.AcTypeLb = AcTypeLb;
        this.AcRegCargWeight = AcRegCargWeight;
        this.AcRegCagLj = AcRegCagLj;
        this.SeatLastLimit = SeatLastLimit;
        this.PassagerName = PassagerName;
        this.RealWeight = RealWeight;
        this.OpUser = OpUser;
        this.OpDate = OpDate;
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

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String FlightId) {
        this.FlightId = FlightId;
    }

    public Integer getSeatId() {
        return SeatId;
    }

    public void setSeatId(Integer SeatId) {
        this.SeatId = SeatId;
    }

    public String getSeatCode() {
        return SeatCode;
    }

    public void setSeatCode(String SeatCode) {
        this.SeatCode = SeatCode;
    }

    public String getSeatType() {
        return SeatType;
    }

    public void setSeatType(String SeatType) {
        this.SeatType = SeatType;
    }

    public Float getAcTypeSeatLimit() {
        return AcTypeSeatLimit;
    }

    public void setAcTypeSeatLimit(Float AcTypeSeatLimit) {
        this.AcTypeSeatLimit = AcTypeSeatLimit;
    }

    public Float getAcTypeLb() {
        return AcTypeLb;
    }

    public void setAcTypeLb(Float AcTypeLb) {
        this.AcTypeLb = AcTypeLb;
    }

    public Float getAcRegCargWeight() {
        return AcRegCargWeight;
    }

    public void setAcRegCargWeight(Float AcRegCargWeight) {
        this.AcRegCargWeight = AcRegCargWeight;
    }

    public Float getAcRegCagLj() {
        return AcRegCagLj;
    }

    public void setAcRegCagLj(Float AcRegCagLj) {
        this.AcRegCagLj = AcRegCagLj;
    }

    public Float getSeatLastLimit() {
        return SeatLastLimit;
    }

    public void setSeatLastLimit(Float SeatLastLimit) {
        this.SeatLastLimit = SeatLastLimit;
    }

    public String getPassagerName() {
        return PassagerName;
    }

    public void setPassagerName(String PassagerName) {
        this.PassagerName = PassagerName;
    }

    public Float getRealWeight() {
        return RealWeight;
    }

    public void setRealWeight(Float RealWeight) {
        this.RealWeight = RealWeight;
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
