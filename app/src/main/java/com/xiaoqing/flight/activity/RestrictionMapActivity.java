package com.xiaoqing.flight.activity;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.InjectView;
import com.xiaoqing.flight.FlightApplication;
import com.xiaoqing.flight.R;
import com.xiaoqing.flight.data.dao.AcWeightLimit;
import com.xiaoqing.flight.data.dao.AddFlightInfo;
import com.xiaoqing.flight.data.dao.AllAcType;
import com.xiaoqing.flight.data.dao.AllAcTypeDao;
import com.xiaoqing.flight.data.dao.AllAircraft;
import com.xiaoqing.flight.data.dao.AllAircraftDao;
import com.xiaoqing.flight.data.dao.FuleLimit;
import com.xiaoqing.flight.data.dao.FuleLimitDao;
import com.xiaoqing.flight.data.dao.SeatByAcReg;
import com.xiaoqing.flight.entity.AcWeightLimitByAcTypeResponse;
import com.xiaoqing.flight.entity.FuleLimitByAcType;
import com.xiaoqing.flight.entity.LineData;
import com.xiaoqing.flight.network.ResponseListner;
import com.xiaoqing.flight.util.ApiServiceManager;
import com.xiaoqing.flight.util.Constants;
import com.xiaoqing.flight.util.DateFormatUtil;
import com.xiaoqing.flight.util.FormatUtil;
import com.xiaoqing.flight.util.MACUtil;
import com.xiaoqing.flight.util.ToastUtil;
import com.xiaoqing.flight.util.UserManager;
import com.xiaoqing.flight.widget.MyLineDegreeView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by QingYang on 15/7/24.
 * 限制图
 */
public class RestrictionMapActivity extends BaseActivity{
    private String TAG = RestrictionMapActivity.class.getSimpleName();

    @InjectView(R.id.tv_maxoil)
    TextView mMaxOil;
    @InjectView(R.id.tv_realityoil)
    EditText mRealityouil;
    @InjectView(R.id.tv_slideoil)
    EditText mSlideOil;
    @InjectView(R.id.tv_flyoil)
    EditText mFlyOil;
    @InjectView(R.id.tv_beforeweight)
    TextView mBeforeWeight;
    @InjectView(R.id.tv_down)
    TextView mDownWight;
    @InjectView(R.id.tv_mac)
    TextView mMac;
    @InjectView(R.id.line_charview)
    MyLineDegreeView mLineCharView;
    //@InjectView(R.id.tv_reality_focus)
    //TextView mRealityFocus;
    //@InjectView(R.id.tv_slide_focus)
    //TextView mSlideFocus;
    //@InjectView(R.id.tv_fly_focus)
    //TextView mFlyFocus;
    //@InjectView(R.id.tv_be_fore_focus)
    //TextView mBroreFocus;
    //@InjectView(R.id.tv_down_focus)
    //TextView mDownFocus;
    private ArrayList<Float> lineX;
    private ArrayList<Float> lineY;

    private ArrayList<SeatByAcReg> seatList;
    private String aircraftType;
    private double airLj = 0;
    List<AllAcType> allAcTypeList;
    private float allWeight;
    private String aircraftreg;
    private Context mContext;

    @Override public int getContentView() {
        return R.layout.activity_restrictionmap;
    }

    @Override public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mContext = RestrictionMapActivity.this;
    }

    @Override protected void onResume() {
        super.onResume();
        if (UserManager.getInstance().isAddFilghtSuccess()) {
            hiddenRightBar();
        }
    }

    @Override protected void onloadData() {
        mTopBarTitle.setText("限制图");
        getTopBarRight("下一步");
        lineX = new ArrayList<>();
        lineY = new ArrayList<>();
        aircraftType = getIntent().getStringExtra(Constants.ACTION_AIRCRAFTTYPE);
        aircraftreg = getIntent().getStringExtra(Constants.ACTION_AIRCRAFTREG);
        seatList = (ArrayList<SeatByAcReg>) getIntent().getSerializableExtra(Constants.ACTION_SEATLIST);
        AllAircraftDao allAircraftDao = FlightApplication.getDaoSession().getAllAircraftDao();
        List<AllAircraft> allAircraftList = allAircraftDao.queryBuilder()
                .where(AllAircraftDao.Properties.AircraftType.eq(aircraftType))
                .list();

        airLj = allAircraftList.get(0).getLj();

        updateWeightInfos();


        //float weightCg = getWeightCg(mRealityouil);
        //mRealityouil.setText(weightCg + "");
        //float weightCg1 = getWeightCg(mSlideOil);
        //mSlideFocus.setText(weightCg1 + "");
        //float weightCg2 = getWeightCg(mFlyOil);
        //mFlyOil.setText(weightCg2 + "");
        //float weightCg3 = getWeightCg(mBeforeWeight);
        //mBeforeWeight.setText(weightCg3 + "");
        //float weightCg4 = getWeightCg(mDownWight);
        //mDownWight.setText(weightCg4+"");

        AllAcTypeDao allAcTypeDao = FlightApplication.getDaoSession().getAllAcTypeDao();
        allAcTypeList = allAcTypeDao.queryBuilder()
                .where(AllAcTypeDao.Properties.AircraftType.eq(aircraftType))
                .list();
        if (allAcTypeList != null && allAcTypeList.size() > 0) {
            AllAcType allAcType = allAcTypeList.get(0);
            //mMaxOil.setText(allAcTypeList.get(0));
        getMoccApi().getAcWeightLimitByAcType(allAcType.getAircraftType(), String.valueOf(allAcType.getPortLimit()),
            mBeforeWeight.getText().toString(), mDownWight.getText().toString(), String.valueOf(allAcType.getMzfw()),
                DateFormatUtil.formatTDate(), String.valueOf(allAcType.getSysVersion()), new ResponseListner<AcWeightLimitByAcTypeResponse>() {
                @Override public void onResponse(AcWeightLimitByAcTypeResponse response) {
                    if (response != null && response.ResponseObject != null && response.ResponseObject.ResponseCode == Constants.RESULT_OK) {
                        showCharView(response.ResponseObject.ResponseData.IAppObject);
                    } else {
                        ToastUtil.showToast(RestrictionMapActivity.this, R.drawable.toast_warning, getString(R.string.get_data_error));
                    }
                }

                @Override public void onEmptyOrError(String message) {
                    ToastUtil.showToast(RestrictionMapActivity.this, R.drawable.toast_warning, getString(R.string.get_data_error));
                }
            });
        }

        showLineCharView();

        mMaxOil.addTextChangedListener(mTextWatcher);
        mRealityouil.addTextChangedListener(mTextWatcher);
        mSlideOil.addTextChangedListener(mTextWatcher);
        mFlyOil.addTextChangedListener(mTextWatcher);

    }


    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override public void afterTextChanged(Editable s) {
            if (!TextUtils.isEmpty(s.toString())) {
                updateWeightInfos();
            }
        }
    };

    private void updateWeightInfos() {
        AllAcTypeDao allAcTypeDao = FlightApplication.getDaoSession().getAllAcTypeDao();
        List<AllAcType> allAcTypeList = allAcTypeDao.queryBuilder()
                .where(AllAircraftDao.Properties.AircraftType.eq(aircraftType))
                .list();
        if (allAcTypeList != null && allAcTypeList.size() > 0) {
            AllAcType allAcType = allAcTypeList.get(0);
            int gooodsWeights = 0;
            if (seatList != null && seatList.size() > 0)
                for(SeatByAcReg seatByAcReg : seatList)
                    gooodsWeights += seatByAcReg.getAcRegSbWeight() + seatByAcReg.getAcRegCargWeight();

            String realOil = mRealityouil.getText().toString().trim();
            String slideOil = mSlideOil.getText().toString().trim();
            String flyOil = mFlyOil.getText().toString().trim();
            float upWeight =
                    allAcType.getMzfw() + (!TextUtils.isEmpty(realOil) ? Float.parseFloat(realOil) : 0) + gooodsWeights
                            - (!TextUtils.isEmpty(slideOil) ? Float.parseFloat(slideOil) : 0);
            mBeforeWeight.setText(FormatUtil.formatTo2Decimal(upWeight));

            float downWeight =
                    allAcType.getMzfw() + (!TextUtils.isEmpty(realOil) ? Float.parseFloat(realOil) : 0) + gooodsWeights
                            - (!TextUtils.isEmpty(slideOil) ? Float.parseFloat(slideOil) : 0)  - (!TextUtils.isEmpty(
                            flyOil) ? Float.parseFloat(flyOil) : 0);

            mDownWight.setText(FormatUtil.formatTo2Decimal(downWeight));
            allWeight = allAcType.getMzfw() + Float.parseFloat(mRealityouil.getText().toString().trim()) + gooodsWeights;


            getFuleLimit();


        }
    }

    private int reqeustCount = 0;

    private void getFuleLimit() {
        float oilLj = 0;
        FuleLimitDao fuleLimitDao = FlightApplication.getDaoSession().getFuleLimitDao();
        List<FuleLimit> fullLimitList = fuleLimitDao.queryBuilder()
                .where(FuleLimitDao.Properties.AcType.eq(aircraftType))
                .list();
        if (fullLimitList != null && fullLimitList.size() > 0) {
            for (FuleLimit fuleLimit : fullLimitList) {
                if (Math.abs(fuleLimit.getFuleWeight() - Float.parseFloat(
                        mRealityouil.getText().toString().trim())) < 80) {
                    oilLj = fuleLimit.getFuleLj();
                }
            }
        }

        double Cg = (airLj + airLj) / allWeight;
        float weightCg = (float)Cg;
        float mac = 0;
        if (MACUtil.TYPE_CE560.equals(aircraftType)) {
            mac = MACUtil.get560Mac(weightCg);
        } else if (MACUtil.TYPE_CE680.equals(aircraftType)) {
            mac = MACUtil.get680Mac(weightCg);
        } else if (MACUtil.TYPE_CE750.equals(aircraftType)) {
            mac = MACUtil.get750Mac(weightCg);
        } else if (MACUtil.TYPE_G450.equals(aircraftType)) {
            mac = MACUtil.getG450Mac(weightCg);
        }

        if (mac != 0)
            mMac.setText(FormatUtil.formatTo2Decimal(mac));
        else
            mMac.setText(" -- ");


        if ((fullLimitList == null || fullLimitList.size() == 0) && reqeustCount < 1) {
            reqeustCount ++;
            if (allAcTypeList != null && allAcTypeList.size() > 0) {
                AllAcType allAcType = allAcTypeList.get(0);
                ApiServiceManager.getInstance().getFuleLimitByAcType(allAcType.getAircraftType(),
                        allAcType.getPortLimit()+"", mBeforeWeight.getText().toString(),
                        mDownWight.getText().toString(), allAcType.getMzfw()+"", DateFormatUtil.formatTDate(),
                        UserManager.getInstance().getUser().getSysVersion()+"", new ResponseListner<FuleLimitByAcType>() {

                            @Override public void onResponse(FuleLimitByAcType response) {
                                if (response != null && response.ResponseObject != null && response.ResponseObject.ResponseCode == Constants.RESULT_OK) {
                                    getFuleLimit();
                                }
                            }

                            @Override public void onEmptyOrError(String message) {
                                if (!TextUtils.isEmpty(message))
                                    ToastUtil.showToast(RestrictionMapActivity.this, R.drawable.toast_warning, message);
                            }
                        });

            }
        }
    }

    private void showCharView(ArrayList<AcWeightLimit> acWeightLimits) {
        LineData lineData = new LineData();
        ArrayList<Float> lineX = new ArrayList<Float>();
        ArrayList<Float> lineY = new ArrayList<Float>();
        for (int i = 0 ; i < acWeightLimits.size(); i++ ) {
            String weight = acWeightLimits.get(i).getWeight();
            float wei = 0;
            if (!TextUtils.isEmpty(weight))
                wei = Float.parseFloat(weight);
            lineX.add(wei);
            String Cg1 = acWeightLimits.get(i).getWeightCg1();
            float weiCg1 = 0;
            if (!TextUtils.isEmpty(Cg1))
                weiCg1 = Float.parseFloat(Cg1);
            lineY.add(weiCg1);
        }

        for (int y = acWeightLimits.size() - 1; y > 0; y--) {
            String weight = acWeightLimits.get(y).getWeight();
            float wei = 0;
            if (!TextUtils.isEmpty(weight))
                wei =Float.parseFloat(weight);
            lineX.add(wei);
            String weightCg2 = acWeightLimits.get(y).getWeightCg2();
            float weiCg2 = 0;
            if (!TextUtils.isEmpty(weightCg2)) {
                lineY.add(weiCg2);
            }
        }
        lineData.setDatasX(lineX);
        lineData.setDatasY(lineY);
        mLineCharView.addData(lineData);

    }

    private void showLineCharView() {
        LineData lineData = new LineData();
        lineData.setDatasX(lineX);
        lineData.setDatasY(lineY);
        mLineCharView.addData(lineData);

    }

    private float getWeightCg(TextView tv) {
        String weight = tv.getText().toString().trim();
        float result = 0;
        float weighFloat = 0;
        if (!TextUtils.isEmpty(weight)) {
            weighFloat = Float.parseFloat(weight);
            float lj = weighFloat / 100;
            double weightCg = lj * 347.51 / weighFloat;
            result =  (float)weightCg;
        }
        lineX.add(weighFloat);
        lineY.add(result);
        return result;
    }


    @Override public View.OnClickListener getRightOnClickListener() {
        return new View.OnClickListener() {
            @Override public void onClick(View v) {

                String maxOil = mMaxOil.getText().toString().trim();
                String realityOil = mRealityouil.getText().toString().trim();
                String slideOil = mSlideOil.getText().toString().trim();
                String flyOil = mFlyOil.getText().toString().trim();
                String beforeWeight = mBeforeWeight.getText().toString().trim();
                String downWeight = mDownWight.getText().toString().trim();
                String macValue = mMac.getText().toString().trim();

                if (TextUtils.isEmpty(maxOil)) {
                    ToastUtil.showToast(mContext, R.drawable.toast_warning, "最大燃油量不能为空");
                    return;
                } else if (TextUtils.isEmpty(realityOil)) {
                    ToastUtil.showToast(mContext, R.drawable.toast_warning, "实际加油量不能为空");
                    return;
                } else if (TextUtils.isEmpty(slideOil)) {
                    ToastUtil.showToast(mContext, R.drawable.toast_warning, "滑行油量不能为空");
                    return;
                } else if (TextUtils.isEmpty(flyOil)) {
                    ToastUtil.showToast(mContext, R.drawable.toast_warning, "航路油量不能为空");
                    return;
                }

                AddFlightInfo addFlightInfo = UserManager.getInstance().getAddFlightInfo();
                addFlightInfo.setMaxFule(maxOil);
                addFlightInfo.setRealFule(realityOil);
                addFlightInfo.setSlieFule(slideOil);
                addFlightInfo.setRouteFule(flyOil);
                addFlightInfo.setTofWeight(beforeWeight);
                addFlightInfo.setLandWeight(downWeight);
                addFlightInfo.setAirportLimitWeight(allAcTypeList.get(0).getPortLimit() + "");
                addFlightInfo.setBalancePic(addFlightInfo.getFlightNo());
                addFlightInfo.setBalancePicName(addFlightInfo.getFlightNo());

                Intent intent =
                        new Intent(RestrictionMapActivity.this, AircraftPersonnelActivity.class);
                intent.putExtra(Constants.ACTION_AIRCRAFTTYPE, aircraftType);
                intent.putExtra(Constants.ACTION_AIRCRAFTREG, aircraftreg);
                startActivity(intent);
            }
        };
    }

    @Override protected void onStop() {
        super.onStop();
        reqeustCount = 0;
    }
}