package com.gdut.dkmfromcg.yybrower.model.gankio;

import com.gdut.dkmfromcg.commonlib.net.callback.RxObserver;
import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;

/**
 * Created by dkmFromCG on 2018/4/18.
 * function:
 */

public interface IGankIoModel {

    String sAndroid = "Android";
    String sIos = "IOS";
    String sWebpage = "前端";
    String sApp = "App";
    String sRecommend = "瞎推荐";

    void getAndroid(int page, int pre_page, RxObserver<GankIoDataEntity> observer);

    void getIOS(int page, int pre_page, RxObserver<GankIoDataEntity> observer);

    void getWebPage(int page, int pre_page, RxObserver<GankIoDataEntity> observer);

    void getApp(int page, int pre_page, RxObserver<GankIoDataEntity> observer);

    void getRecommend(int page, int pre_page, RxObserver<GankIoDataEntity> observer);

}
