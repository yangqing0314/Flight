package com.xiaoqing.flight.data.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.xiaoqing.flight.data.dao.AddFlightInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ADD_FLIGHT_INFO.
*/
public class AddFlightInfoDao extends AbstractDao<AddFlightInfo, Long> {

    public static final String TABLENAME = "ADD_FLIGHT_INFO";

    /**
     * Properties of entity AddFlightInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FlightDate = new Property(1, String.class, "FlightDate", false, "FLIGHT_DATE");
        public final static Property FlightId = new Property(2, String.class, "FlightId", false, "FLIGHT_ID");
        public final static Property AircraftReg = new Property(3, String.class, "AircraftReg", false, "AIRCRAFT_REG");
        public final static Property AircraftType = new Property(4, String.class, "AircraftType", false, "AIRCRAFT_TYPE");
        public final static Property FlightNo = new Property(5, String.class, "FlightNo", false, "FLIGHT_NO");
        public final static Property Dep4Code = new Property(6, String.class, "Dep4Code", false, "DEP4_CODE");
        public final static Property DepAirportName = new Property(7, String.class, "DepAirportName", false, "DEP_AIRPORT_NAME");
        public final static Property Arr4Code = new Property(8, String.class, "Arr4Code", false, "ARR4_CODE");
        public final static Property ArrAirportName = new Property(9, String.class, "ArrAirportName", false, "ARR_AIRPORT_NAME");
        public final static Property MaxFule = new Property(10, String.class, "MaxFule", false, "MAX_FULE");
        public final static Property RealFule = new Property(11, String.class, "RealFule", false, "REAL_FULE");
        public final static Property SlieFule = new Property(12, String.class, "SlieFule", false, "SLIE_FULE");
        public final static Property RouteFule = new Property(13, String.class, "RouteFule", false, "ROUTE_FULE");
        public final static Property TofWeight = new Property(14, String.class, "TofWeight", false, "TOF_WEIGHT");
        public final static Property LandWeight = new Property(15, String.class, "LandWeight", false, "LAND_WEIGHT");
        public final static Property NoFuleWeight = new Property(16, String.class, "NoFuleWeight", false, "NO_FULE_WEIGHT");
        public final static Property AirportLimitWeight = new Property(17, String.class, "AirportLimitWeight", false, "AIRPORT_LIMIT_WEIGHT");
        public final static Property BalancePic = new Property(18, String.class, "BalancePic", false, "BALANCE_PIC");
        public final static Property BalancePicName = new Property(19, String.class, "BalancePicName", false, "BALANCE_PIC_NAME");
        public final static Property OpUser = new Property(20, String.class, "OpUser", false, "OP_USER");
        public final static Property OpUserName = new Property(21, String.class, "OpUserName", false, "OP_USER_NAME");
        public final static Property OpDate = new Property(22, String.class, "OpDate", false, "OP_DATE");
        public final static Property WeightCg = new Property(23, String.class, "weightCg", false, "WEIGHT_CG");
        public final static Property Caption = new Property(24, String.class, "Caption", false, "CAPTION");
        public final static Property TkoZx = new Property(25, String.class, "TkoZx", false, "TKO_ZX");
        public final static Property TkoMac = new Property(26, String.class, "TkoMac", false, "TKO_MAC");
        public final static Property PassengerWeight = new Property(27, String.class, "passengerWeight", false, "PASSENGER_WEIGHT");
        public final static Property ArticleWeight = new Property(28, String.class, "articleWeight", false, "ARTICLE_WEIGHT");
        public final static Property BeforeFlyFule = new Property(29, String.class, "beforeFlyFule", false, "BEFORE_FLY_FULE");
        public final static Property LandWeightCg = new Property(30, String.class, "landWeightCg", false, "LAND_WEIGHT_CG");
        public final static Property BeforeWCgmin = new Property(31, String.class, "beforeWCgmin", false, "BEFORE_WCGMIN");
        public final static Property BeforeWCgmax = new Property(32, String.class, "beforeWCgmax", false, "BEFORE_WCGMAX");
        public final static Property LandWCgmin = new Property(33, String.class, "landWCgmin", false, "LAND_WCGMIN");
        public final static Property LandWCgmax = new Property(34, String.class, "landWCgmax", false, "LAND_WCGMAX");
        public final static Property UseWeight = new Property(35, Float.class, "UseWeight", false, "USE_WEIGHT");
        public final static Property UseWeightCg = new Property(36, Float.class, "UseWeightCg", false, "USE_WEIGHT_CG");
        public final static Property BasicWeight = new Property(37, String.class, "BasicWeight", false, "BASIC_WEIGHT");
        public final static Property AllSbLj = new Property(38, Float.class, "allSbLj", false, "ALL_SB_LJ");
    };


    public AddFlightInfoDao(DaoConfig config) {
        super(config);
    }
    
    public AddFlightInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ADD_FLIGHT_INFO' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'FLIGHT_DATE' TEXT," + // 1: FlightDate
                "'FLIGHT_ID' TEXT NOT NULL ," + // 2: FlightId
                "'AIRCRAFT_REG' TEXT," + // 3: AircraftReg
                "'AIRCRAFT_TYPE' TEXT," + // 4: AircraftType
                "'FLIGHT_NO' TEXT," + // 5: FlightNo
                "'DEP4_CODE' TEXT," + // 6: Dep4Code
                "'DEP_AIRPORT_NAME' TEXT," + // 7: DepAirportName
                "'ARR4_CODE' TEXT," + // 8: Arr4Code
                "'ARR_AIRPORT_NAME' TEXT," + // 9: ArrAirportName
                "'MAX_FULE' TEXT," + // 10: MaxFule
                "'REAL_FULE' TEXT," + // 11: RealFule
                "'SLIE_FULE' TEXT," + // 12: SlieFule
                "'ROUTE_FULE' TEXT," + // 13: RouteFule
                "'TOF_WEIGHT' TEXT," + // 14: TofWeight
                "'LAND_WEIGHT' TEXT," + // 15: LandWeight
                "'NO_FULE_WEIGHT' TEXT," + // 16: NoFuleWeight
                "'AIRPORT_LIMIT_WEIGHT' TEXT," + // 17: AirportLimitWeight
                "'BALANCE_PIC' TEXT," + // 18: BalancePic
                "'BALANCE_PIC_NAME' TEXT," + // 19: BalancePicName
                "'OP_USER' TEXT," + // 20: OpUser
                "'OP_USER_NAME' TEXT," + // 21: OpUserName
                "'OP_DATE' TEXT," + // 22: OpDate
                "'WEIGHT_CG' TEXT," + // 23: weightCg
                "'CAPTION' TEXT," + // 24: Caption
                "'TKO_ZX' TEXT," + // 25: TkoZx
                "'TKO_MAC' TEXT," + // 26: TkoMac
                "'PASSENGER_WEIGHT' TEXT," + // 27: passengerWeight
                "'ARTICLE_WEIGHT' TEXT," + // 28: articleWeight
                "'BEFORE_FLY_FULE' TEXT," + // 29: beforeFlyFule
                "'LAND_WEIGHT_CG' TEXT," + // 30: landWeightCg
                "'BEFORE_WCGMIN' TEXT," + // 31: beforeWCgmin
                "'BEFORE_WCGMAX' TEXT," + // 32: beforeWCgmax
                "'LAND_WCGMIN' TEXT," + // 33: landWCgmin
                "'LAND_WCGMAX' TEXT," + // 34: landWCgmax
                "'USE_WEIGHT' REAL," + // 35: UseWeight
                "'USE_WEIGHT_CG' REAL," + // 36: UseWeightCg
                "'BASIC_WEIGHT' TEXT," + // 37: BasicWeight
                "'ALL_SB_LJ' REAL);"); // 38: allSbLj
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ADD_FLIGHT_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AddFlightInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String FlightDate = entity.getFlightDate();
        if (FlightDate != null) {
            stmt.bindString(2, FlightDate);
        }
        stmt.bindString(3, entity.getFlightId());
 
        String AircraftReg = entity.getAircraftReg();
        if (AircraftReg != null) {
            stmt.bindString(4, AircraftReg);
        }
 
        String AircraftType = entity.getAircraftType();
        if (AircraftType != null) {
            stmt.bindString(5, AircraftType);
        }
 
        String FlightNo = entity.getFlightNo();
        if (FlightNo != null) {
            stmt.bindString(6, FlightNo);
        }
 
        String Dep4Code = entity.getDep4Code();
        if (Dep4Code != null) {
            stmt.bindString(7, Dep4Code);
        }
 
        String DepAirportName = entity.getDepAirportName();
        if (DepAirportName != null) {
            stmt.bindString(8, DepAirportName);
        }
 
        String Arr4Code = entity.getArr4Code();
        if (Arr4Code != null) {
            stmt.bindString(9, Arr4Code);
        }
 
        String ArrAirportName = entity.getArrAirportName();
        if (ArrAirportName != null) {
            stmt.bindString(10, ArrAirportName);
        }
 
        String MaxFule = entity.getMaxFule();
        if (MaxFule != null) {
            stmt.bindString(11, MaxFule);
        }
 
        String RealFule = entity.getRealFule();
        if (RealFule != null) {
            stmt.bindString(12, RealFule);
        }
 
        String SlieFule = entity.getSlieFule();
        if (SlieFule != null) {
            stmt.bindString(13, SlieFule);
        }
 
        String RouteFule = entity.getRouteFule();
        if (RouteFule != null) {
            stmt.bindString(14, RouteFule);
        }
 
        String TofWeight = entity.getTofWeight();
        if (TofWeight != null) {
            stmt.bindString(15, TofWeight);
        }
 
        String LandWeight = entity.getLandWeight();
        if (LandWeight != null) {
            stmt.bindString(16, LandWeight);
        }
 
        String NoFuleWeight = entity.getNoFuleWeight();
        if (NoFuleWeight != null) {
            stmt.bindString(17, NoFuleWeight);
        }
 
        String AirportLimitWeight = entity.getAirportLimitWeight();
        if (AirportLimitWeight != null) {
            stmt.bindString(18, AirportLimitWeight);
        }
 
        String BalancePic = entity.getBalancePic();
        if (BalancePic != null) {
            stmt.bindString(19, BalancePic);
        }
 
        String BalancePicName = entity.getBalancePicName();
        if (BalancePicName != null) {
            stmt.bindString(20, BalancePicName);
        }
 
        String OpUser = entity.getOpUser();
        if (OpUser != null) {
            stmt.bindString(21, OpUser);
        }
 
        String OpUserName = entity.getOpUserName();
        if (OpUserName != null) {
            stmt.bindString(22, OpUserName);
        }
 
        String OpDate = entity.getOpDate();
        if (OpDate != null) {
            stmt.bindString(23, OpDate);
        }
 
        String weightCg = entity.getWeightCg();
        if (weightCg != null) {
            stmt.bindString(24, weightCg);
        }
 
        String Caption = entity.getCaption();
        if (Caption != null) {
            stmt.bindString(25, Caption);
        }
 
        String TkoZx = entity.getTkoZx();
        if (TkoZx != null) {
            stmt.bindString(26, TkoZx);
        }
 
        String TkoMac = entity.getTkoMac();
        if (TkoMac != null) {
            stmt.bindString(27, TkoMac);
        }
 
        String passengerWeight = entity.getPassengerWeight();
        if (passengerWeight != null) {
            stmt.bindString(28, passengerWeight);
        }
 
        String articleWeight = entity.getArticleWeight();
        if (articleWeight != null) {
            stmt.bindString(29, articleWeight);
        }
 
        String beforeFlyFule = entity.getBeforeFlyFule();
        if (beforeFlyFule != null) {
            stmt.bindString(30, beforeFlyFule);
        }
 
        String landWeightCg = entity.getLandWeightCg();
        if (landWeightCg != null) {
            stmt.bindString(31, landWeightCg);
        }
 
        String beforeWCgmin = entity.getBeforeWCgmin();
        if (beforeWCgmin != null) {
            stmt.bindString(32, beforeWCgmin);
        }
 
        String beforeWCgmax = entity.getBeforeWCgmax();
        if (beforeWCgmax != null) {
            stmt.bindString(33, beforeWCgmax);
        }
 
        String landWCgmin = entity.getLandWCgmin();
        if (landWCgmin != null) {
            stmt.bindString(34, landWCgmin);
        }
 
        String landWCgmax = entity.getLandWCgmax();
        if (landWCgmax != null) {
            stmt.bindString(35, landWCgmax);
        }
 
        Float UseWeight = entity.getUseWeight();
        if (UseWeight != null) {
            stmt.bindDouble(36, UseWeight);
        }
 
        Float UseWeightCg = entity.getUseWeightCg();
        if (UseWeightCg != null) {
            stmt.bindDouble(37, UseWeightCg);
        }
 
        String BasicWeight = entity.getBasicWeight();
        if (BasicWeight != null) {
            stmt.bindString(38, BasicWeight);
        }
 
        Float allSbLj = entity.getAllSbLj();
        if (allSbLj != null) {
            stmt.bindDouble(39, allSbLj);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AddFlightInfo readEntity(Cursor cursor, int offset) {
        AddFlightInfo entity = new AddFlightInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // FlightDate
            cursor.getString(offset + 2), // FlightId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // AircraftReg
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // AircraftType
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // FlightNo
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // Dep4Code
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // DepAirportName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // Arr4Code
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ArrAirportName
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // MaxFule
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // RealFule
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // SlieFule
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // RouteFule
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // TofWeight
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // LandWeight
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // NoFuleWeight
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // AirportLimitWeight
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // BalancePic
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // BalancePicName
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // OpUser
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // OpUserName
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // OpDate
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // weightCg
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // Caption
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // TkoZx
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // TkoMac
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // passengerWeight
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // articleWeight
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // beforeFlyFule
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // landWeightCg
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // beforeWCgmin
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // beforeWCgmax
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // landWCgmin
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // landWCgmax
            cursor.isNull(offset + 35) ? null : cursor.getFloat(offset + 35), // UseWeight
            cursor.isNull(offset + 36) ? null : cursor.getFloat(offset + 36), // UseWeightCg
            cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37), // BasicWeight
            cursor.isNull(offset + 38) ? null : cursor.getFloat(offset + 38) // allSbLj
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AddFlightInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFlightDate(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFlightId(cursor.getString(offset + 2));
        entity.setAircraftReg(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAircraftType(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFlightNo(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDep4Code(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDepAirportName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setArr4Code(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setArrAirportName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setMaxFule(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRealFule(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setSlieFule(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRouteFule(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setTofWeight(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setLandWeight(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setNoFuleWeight(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setAirportLimitWeight(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setBalancePic(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setBalancePicName(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setOpUser(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setOpUserName(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setOpDate(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setWeightCg(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setCaption(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setTkoZx(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setTkoMac(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setPassengerWeight(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setArticleWeight(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setBeforeFlyFule(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setLandWeightCg(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setBeforeWCgmin(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setBeforeWCgmax(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setLandWCgmin(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setLandWCgmax(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setUseWeight(cursor.isNull(offset + 35) ? null : cursor.getFloat(offset + 35));
        entity.setUseWeightCg(cursor.isNull(offset + 36) ? null : cursor.getFloat(offset + 36));
        entity.setBasicWeight(cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37));
        entity.setAllSbLj(cursor.isNull(offset + 38) ? null : cursor.getFloat(offset + 38));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AddFlightInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AddFlightInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
