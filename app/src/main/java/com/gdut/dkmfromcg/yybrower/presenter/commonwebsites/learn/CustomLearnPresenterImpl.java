package com.gdut.dkmfromcg.yybrower.presenter.commonwebsites.learn;

import com.gdut.dkmfromcg.commonlib.mvp.BasePresenter;
import com.gdut.dkmfromcg.commonlib.net.callback.RxObserver;
import com.gdut.dkmfromcg.commonlib.net.exception.ApiException;
import com.gdut.dkmfromcg.yybrower.entities.GankIoDataEntity;
import com.gdut.dkmfromcg.yybrower.model.gankio.IGankIoModel;
import com.gdut.dkmfromcg.yybrower.view.commonwebsites.learn.ICustomLearnView;

import java.util.List;

import io.reactivex.disposables.Disposable;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class CustomLearnPresenterImpl extends BasePresenter<ICustomLearnView> implements ICustomLearnPresenter {

    private final IGankIoModel mGankIoModel;
    public CustomLearnPresenterImpl(ICustomLearnView view, IGankIoModel gankIoModel) {
        super(view);
        this.mGankIoModel=gankIoModel;
    }


    @Override
    public void initRecyclerView(String gankIoType) {
        if (IGankIoModel.sAndroid.equals(gankIoType)){
            mGankIoModel.getAndroid(1, 20, new RxObserver<GankIoDataEntity>() {
                @Override
                protected void onStart(Disposable d) {

                }

                @Override
                protected void onSuccess(GankIoDataEntity response) {
                    List<GankIoDataEntity.ResultBean> resultBeans=response.getResults();
                    getView().initRecyclerView(resultBeans);
                }

                @Override
                protected void onError(ApiException e) {

                }
            });
        }
        else if (IGankIoModel.sIos.equals(gankIoType)){
            mGankIoModel.getIOS(1, 20, new RxObserver<GankIoDataEntity>() {
                @Override
                protected void onStart(Disposable d) {

                }

                @Override
                protected void onSuccess(GankIoDataEntity response) {
                    List<GankIoDataEntity.ResultBean> resultBeans=response.getResults();
                    getView().initRecyclerView(resultBeans);
                }

                @Override
                protected void onError(ApiException e) {

                }
            });
        }
        else if (IGankIoModel.sWebpage.equals(gankIoType)){
            mGankIoModel.getWebPage(1, 20, new RxObserver<GankIoDataEntity>() {
                @Override
                protected void onStart(Disposable d) {

                }

                @Override
                protected void onSuccess(GankIoDataEntity response) {
                    List<GankIoDataEntity.ResultBean> resultBeans=response.getResults();
                    getView().initRecyclerView(resultBeans);
                }

                @Override
                protected void onError(ApiException e) {

                }
            });
        }
        else if (IGankIoModel.sApp.equals(gankIoType)){
            mGankIoModel.getApp(1, 20, new RxObserver<GankIoDataEntity>() {
                @Override
                protected void onStart(Disposable d) {

                }

                @Override
                protected void onSuccess(GankIoDataEntity response) {
                    List<GankIoDataEntity.ResultBean> resultBeans=response.getResults();
                    getView().initRecyclerView(resultBeans);
                }

                @Override
                protected void onError(ApiException e) {

                }
            });
        }
        else if (IGankIoModel.sRecommend.equals(gankIoType)){
            mGankIoModel.getRecommend(1, 20, new RxObserver<GankIoDataEntity>() {
                @Override
                protected void onStart(Disposable d) {

                }

                @Override
                protected void onSuccess(GankIoDataEntity response) {
                    List<GankIoDataEntity.ResultBean> resultBeans=response.getResults();
                    getView().initRecyclerView(resultBeans);
                }

                @Override
                protected void onError(ApiException e) {

                }
            });
        }
    }
}
