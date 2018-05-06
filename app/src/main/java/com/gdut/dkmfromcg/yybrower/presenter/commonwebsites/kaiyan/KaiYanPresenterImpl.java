package com.gdut.dkmfromcg.yybrower.presenter.commonwebsites.kaiyan;

import com.gdut.dkmfromcg.commonlib.mvp.BasePresenter;
import com.gdut.dkmfromcg.commonlib.mvp.datahandler.HandleMessage;
import com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo.KaiYanEntity;
import com.gdut.dkmfromcg.yybrower.model.kaiyan.IKaiYanModel;
import com.gdut.dkmfromcg.yybrower.view.commonwebsites.kaiyan.IKaiYanView;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class KaiYanPresenterImpl extends BasePresenter<IKaiYanView> implements IKaiYanPresenter {

    private final int VIDEO_MESSAGE = -1;

    private final IKaiYanModel kaiYanModel;

    public KaiYanPresenterImpl(IKaiYanView view, IKaiYanModel model) {
        super(view);
        this.kaiYanModel = model;
    }

    @HandleMessage(message = VIDEO_MESSAGE)
    public void afterGetVideoData(KaiYanEntity kaiYanEntity) {
        getView().initRecyclerView(kaiYanEntity);
    }

    @Override
    public void initRecyclerView() {
        kaiYanModel.getVideoData(VIDEO_MESSAGE);
    }
}
