package com.gdut.dkmfromcg.yybrower.view.commonwebsites.kaiyan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.gdut.dkmfromcg.commonlib.fragments.ProxyFragment;
import com.gdut.dkmfromcg.commonlib.util.log.Logger;
import com.gdut.dkmfromcg.yybrower.R;
import com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo.KaiYanEntity;
import com.gdut.dkmfromcg.yybrower.entities.kaiyanvideo.VideoEntity;
import com.gdut.dkmfromcg.yybrower.model.kaiyan.KaiYanModel;
import com.gdut.dkmfromcg.yybrower.presenter.commonwebsites.kaiyan.KaiYanPresenterImpl;

import java.util.List;

/**
 * Created by dkmFromCG on 2018/4/20.
 * function:
 */

public class KaiYanFragment extends ProxyFragment implements IKaiYanView {

    private RecyclerView mRecyclerView = null;

    private KaiYanModel kaiYanModel = null;
    private KaiYanPresenterImpl kaiYanPresenter = null;

    @Override
    public Object setLayout() {
        return R.layout.fragment_recyclerview;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        mRecyclerView = rootView.findViewById(R.id.recycler_view);
        kaiYanModel = new KaiYanModel(this);
        kaiYanPresenter = new KaiYanPresenterImpl(this, kaiYanModel);
        kaiYanPresenter.initRecyclerView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (kaiYanModel != null) {
            kaiYanModel.detachLifecycleProvider();
        }
        if (kaiYanPresenter != null) {
            kaiYanPresenter.detachView();
        }
    }


    @Override
    public void initRecyclerView(KaiYanEntity kaiYanEntity) {
        final List<VideoEntity> videoEntityList = kaiYanEntity.getItemList();
        for (VideoEntity videoEntity : videoEntityList) {
            final String imgUrl = videoEntity.getData().getCover().getHomepage();
            Logger.d("imgUrl: ", imgUrl);
        }
    }
}
