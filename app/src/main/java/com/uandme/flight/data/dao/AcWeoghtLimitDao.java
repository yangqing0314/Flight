package com.uandme.flight.data.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.uandme.flight.data.dao.AcWeoghtLimit;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table AC_WEOGHT_LIMIT.
*/
public class AcWeoghtLimitDao extends AbstractDao<AcWeoghtLimit, Long> {

    public static final String TABLENAME = "AC_WEOGHT_LIMIT";

    /**
     * Properties of entity AcWeoghtLimit.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property AcType = new Property(1, String.class, "AcType", false, "AC_TYPE");
        public final static Property Weight = new Property(2, Integer.class, "Weight", false, "WEIGHT");
        public final static Property WeightCg1 = new Property(3, Double.class, "WeightCg1", false, "WEIGHT_CG1");
        public final static Property WeightCg2 = new Property(4, Double.class, "WeightCg2", false, "WEIGHT_CG2");
        public final static Property OpUser = new Property(5, String.class, "OpUser", false, "OP_USER");
        public final static Property OpDate = new Property(6, String.class, "OpDate", false, "OP_DATE");
    };


    public AcWeoghtLimitDao(DaoConfig config) {
        super(config);
    }
    
    public AcWeoghtLimitDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'AC_WEOGHT_LIMIT' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: id
                "'AC_TYPE' TEXT," + // 1: AcType
                "'WEIGHT' INTEGER," + // 2: Weight
                "'WEIGHT_CG1' REAL," + // 3: WeightCg1
                "'WEIGHT_CG2' REAL," + // 4: WeightCg2
                "'OP_USER' TEXT," + // 5: OpUser
                "'OP_DATE' TEXT);"); // 6: OpDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'AC_WEOGHT_LIMIT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, AcWeoghtLimit entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String AcType = entity.getAcType();
        if (AcType != null) {
            stmt.bindString(2, AcType);
        }
 
        Integer Weight = entity.getWeight();
        if (Weight != null) {
            stmt.bindLong(3, Weight);
        }
 
        Double WeightCg1 = entity.getWeightCg1();
        if (WeightCg1 != null) {
            stmt.bindDouble(4, WeightCg1);
        }
 
        Double WeightCg2 = entity.getWeightCg2();
        if (WeightCg2 != null) {
            stmt.bindDouble(5, WeightCg2);
        }
 
        String OpUser = entity.getOpUser();
        if (OpUser != null) {
            stmt.bindString(6, OpUser);
        }
 
        String OpDate = entity.getOpDate();
        if (OpDate != null) {
            stmt.bindString(7, OpDate);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public AcWeoghtLimit readEntity(Cursor cursor, int offset) {
        AcWeoghtLimit entity = new AcWeoghtLimit( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // AcType
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // Weight
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // WeightCg1
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // WeightCg2
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // OpUser
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // OpDate
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, AcWeoghtLimit entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setAcType(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWeight(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setWeightCg1(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setWeightCg2(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setOpUser(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setOpDate(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(AcWeoghtLimit entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(AcWeoghtLimit entity) {
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