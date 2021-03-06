package com.xiaoqing.flight.network.synchronous;

/**
 * Created by QingYang on 15/8/30.
 */
public enum FeedType {
    ADD_PLAYINFO,//航班信息
    ADD_FLIGHTPERSON;//机上成员和货物信息


    public static int toInt(FeedType feedType){
        switch (feedType){
            case ADD_PLAYINFO:
                return 1;
            case ADD_FLIGHTPERSON:
                return 2;
            default:
                return -1;
        }
    }
}
