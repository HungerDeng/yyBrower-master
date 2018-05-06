package com.gdut.dkmfromcg.yybrower.model.gankio;

import com.gdut.dkmfromcg.commonlib.mvp.BaseModel;
import com.gdut.dkmfromcg.commonlib.net.RestClient;
import com.gdut.dkmfromcg.commonlib.net.callback.RxObserver;
import com.gdut.dkmfromcg.yybrower.app.Api;
import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;
import com.trello.rxlifecycle2.LifecycleProvider;

/**
 * Created by dkmFromCG on 2018/4/18.
 * function:
 */

public class GankIoModel extends BaseModel implements IGankIoModel {

    private final RestClient restClient;
    private final GankIoServices services;

    public GankIoModel(LifecycleProvider lifecycleProvider) {
        super(lifecycleProvider);
        restClient = RestClient.builder().setLifecycleProvider(lifecycleProvider).build();
        services = restClient.createCustomService(GankIoServices.class, Api.GANK_IO_BASE_URL);
    }


    @Override
    public void getAndroid(int page, int pre_page, RxObserver<GankIoDataEntity> observer) {
        restClient.call(services.getGankIoData(sAndroid, page, pre_page), observer);
    }

    @Override
    public void getIOS(int page, int pre_page, RxObserver<GankIoDataEntity> observer) {
        restClient.call(services.getGankIoData(sIos, page, pre_page), observer);
    }

    @Override
    public void getWebPage(int page, int pre_page, RxObserver<GankIoDataEntity> observer) {
        restClient.call(services.getGankIoData(sWebpage, page, pre_page), observer);
    }

    @Override
    public void getApp(int page, int pre_page, RxObserver<GankIoDataEntity> observer) {
        restClient.call(services.getGankIoData(sApp, page, pre_page), observer);
    }

    @Override
    public void getRecommend(int page, int pre_page, RxObserver<GankIoDataEntity> observer) {
        restClient.call(services.getGankIoData(sRecommend, page, pre_page), observer);
    }

}
