package com.gdut.dkmfromcg.yybrower.presenter.main;

import com.gdut.dkmfromcg.commonlib.mvp.BasePresenter;
import com.gdut.dkmfromcg.commonlib.mvp.datahandler.HandleMessage;
import com.gdut.dkmfromcg.yybrower.entities.CommonWebsiteEntity;
import com.gdut.dkmfromcg.yybrower.model.commonwebsites.ICommonWebsiteModel;
import com.gdut.dkmfromcg.yybrower.view.main.IHomePageView;

import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/5.
 * function:
 */

public class HomePagePresenterImpl extends BasePresenter<IHomePageView> implements IHomePagePresenter {

    @SuppressWarnings("FieldCanBeLocal")
    private final int commonWebsiteCallback=0;

    private final ICommonWebsiteModel model;

    public HomePagePresenterImpl(IHomePageView view,ICommonWebsiteModel model) {
        super(view);
        this.model=model;
    }


    @HandleMessage(message = commonWebsiteCallback)
    public void getCommonWebsitesCallback(List<CommonWebsiteEntity> entities) {
        getView().initRecv(entities);
    }

    @Override
    public void getCommonWebsites() {
        model.queryCollectCommonWebsites(commonWebsiteCallback);
    }


}
